package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
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
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v5).visit(((com.google.javascript.rhino.jstype.Visitor)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v5).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getPropertiesCount();
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    ((com.google.javascript.rhino.jstype.JSType)v4).clearResolved();
    Object v5 = null;
    Object v6 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).getOwnerFunction();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "X";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getSlot(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).toMaybeFunctionType();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "NAME, LP, or BLOCK node expected; found: ";
    Object v6 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).removeProperty(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "_S";
    Object v12 = "s";
    Object v13 = 2;
    Object v14 = -12;
    Object v15 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v7).canCastTo(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.NamedType)v7).getReferencedType();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplateKeys();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v7).differsFrom(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEmptyType();
    Object v6 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).getTypeOfThis();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v4).canTestForShallowEqualityWith(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    ((com.google.javascript.rhino.jstype.ObjectType)v5).clearCachedValues();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "_S";
    Object v9 = "s";
    Object v10 = 2;
    Object v11 = -12;
    Object v12 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v4).isSubtype(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v4).isTemplateType();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v7).getConstructor();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getCtorExtendedInterfaces();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).hasAnyTemplateTypes();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "_S";
    Object v12 = "s";
    Object v13 = 2;
    Object v14 = -12;
    Object v15 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v7).isNativeObjectType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getPropertiesCount();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = "";
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "";
    Object v15 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.SimpleSlot(((java.lang.String)v10),((com.google.javascript.rhino.jstype.JSType)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.StaticSlot)v17).getName();
    Object v19 = "";
    Object v20 = ((com.google.javascript.rhino.jstype.NamedType)v7).getTypedefType(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticSlot)v17),((java.lang.String)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).collapseUnion();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).isFunctionPrototypeType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getPropertiesCount();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = "";
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "";
    Object v15 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.SimpleSlot(((java.lang.String)v10),((com.google.javascript.rhino.jstype.JSType)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.StaticSlot)v17).getName();
    Object v19 = "";
    Object v20 = ((com.google.javascript.rhino.jstype.NamedType)v7).getTypedefType(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticSlot)v17),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v20).isNullable();
    Object v22 = ((com.google.javascript.rhino.jstype.JSType)v20).isEnumElementType();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isGlobalThisType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v4).differsFrom(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v4).isString();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "_S";
    Object v13 = "s";
    Object v14 = 2;
    Object v15 = -12;
    Object v16 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.NamedType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v8),((com.google.javascript.rhino.jstype.StaticScope)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v7).getImplicitPrototype();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).collapseUnion();
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).isObject();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isResolved();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "";
    Object v9 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getTemplatizedType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getPropertiesCount();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = "";
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "";
    Object v15 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.SimpleSlot(((java.lang.String)v10),((com.google.javascript.rhino.jstype.JSType)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.StaticSlot)v17).getName();
    Object v19 = "";
    Object v20 = ((com.google.javascript.rhino.jstype.NamedType)v7).getTypedefType(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticSlot)v17),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v20).getParameterType();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).isPropertyInExterns(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = "";
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "_S";
    Object v11 = "s";
    Object v12 = 2;
    Object v13 = -12;
    Object v14 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 1;
    Object v16 = "a";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.ObjectType)v5).defineInferredProperty(((java.lang.String)v6),((com.google.javascript.rhino.jstype.JSType)v14),((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).collapseUnion();
    Object v6 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v5).getConstructor();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "";
    Object v12 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11));
    Object v13 = "goog.requir";
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).hasTemplatizedType(((java.lang.String)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v7).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "_S";
    Object v12 = "s";
    Object v13 = 2;
    Object v14 = -12;
    Object v15 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v18 = "\"";
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v17).getTemplatizedType(((java.lang.String)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "-";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).hasOwnProperty(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).isParameterizedType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).collapseUnion();
    Object v6 = "p6rototype";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).hasOwnProperty(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "";
    Object v12 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v12).collapseUnion();
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v7).differsFrom(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "";
    Object v9 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "";
    Object v14 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.lang.String)v13));
    Object v15 = "";
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).getTemplatizedType(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).collapseUnion();
    Object v6 = "</ul>";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).hasProperty(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v5).isObject();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toDebugHashCodeString();
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v5).differsFrom(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ObjectType)v4).hasCachedValues();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getPropertyNode(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "call";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "call";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v6).isPropertyTypeDeclared(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "T";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).getOwnPropertyJSDocInfo(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "";
    Object v9 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getTemplatizedType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = "X";
    Object v14 = ((com.google.javascript.rhino.jstype.ObjectType)v12).isPropertyTypeInferred(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "";
    Object v18 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((java.lang.String)v17));
    Object v19 = "";
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v18).getTemplatizedType(((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.JSType)v13).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "";
    Object v12 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11));
    Object v13 = "goog.requir";
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).hasTemplatizedType(((java.lang.String)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = "_S";
    Object v20 = "s";
    Object v21 = 2;
    Object v22 = -12;
    Object v23 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.jstype.JSType)v15).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v26 = "\"";
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v25).getTemplatizedType(((java.lang.String)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v27));
    Object v29 = ((com.google.javascript.rhino.jstype.JSType)v7).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.JSType)v4).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "";
    Object v12 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11));
    Object v13 = "goog.requir";
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).hasTemplatizedType(((java.lang.String)v13));
    Object v15 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = "_S";
    Object v21 = "s";
    Object v22 = 2;
    Object v23 = -12;
    Object v24 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19),((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v15).resolve(((com.google.javascript.rhino.ErrorReporter)v16),((com.google.javascript.rhino.jstype.StaticScope)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v15));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = "goog.requir";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).hasTemplatizedType(((java.lang.String)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = "u";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).getPropertyNode(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v11).getTemplatizedType(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v6).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = "}";
    Object v9 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getPropertyNode(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "";
    Object v12 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11));
    Object v13 = "call";
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v12).getTemplatizedType(((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderInequality(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.ModificationVisitor(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v7).visit(((com.google.javascript.rhino.jstype.Visitor)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType(((com.google.javascript.rhino.jstype.JSType)v7));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v7).hasDisplayName();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "";
    Object v9 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getTemplatizedType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v12).restrictByNotNullOrUndefined();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v6),((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "";
    Object v15 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v15).getTemplatizedType(((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v10).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v5).differsFrom(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "";
    Object v24 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),((java.lang.String)v23));
    Object v25 = "call";
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v24).getTemplatizedType(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v5).differsFrom(((com.google.javascript.rhino.jstype.JSType)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).getOwnerFunction();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType(((com.google.javascript.rhino.jstype.JSType)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v7).collapseUnion();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).setLastGeneration((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "L";
    Object v6 = "";
    Object v7 = 9;
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).collapseUnion();
    Object v6 = "d";
    Object v7 = ((com.google.javascript.rhino.jstype.ObjectType)v5).hasProperty(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(((com.google.javascript.rhino.jstype.JSType)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "call";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.jstype.JSType)v6).isTemplateType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).setLastGeneration((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "L";
    Object v6 = "";
    Object v7 = 9;
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "o";
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "";
    Object v15 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14));
    Object v16 = "call";
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v15).getTemplatizedType(((java.lang.String)v16));
    Object v18 = false;
    Object v19 = 1;
    Object v20 = "a";
    Object v21 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v22 = ((com.google.javascript.rhino.jstype.NamedType)v9).defineProperty(((java.lang.String)v10),((com.google.javascript.rhino.jstype.JSType)v17),(((java.lang.Boolean)v18).booleanValue()),((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v7).collapseUnion();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v12).setLastGeneration((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    Object v15 = "L";
    Object v16 = "";
    Object v17 = 9;
    Object v18 = 1;
    Object v19 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v8).resolve(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v19));
    Object v21 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.ProxyObjectType)v8).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).collapseUnion();
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = "call";
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v10).getTemplatizedType(((java.lang.String)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v5).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.JSType)v5).isUnionType();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getPropertiesCount();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).collapseUnion();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).toObjectType();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v7).getOwnerFunction();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "_S";
    Object v12 = "s";
    Object v13 = 2;
    Object v14 = -12;
    Object v15 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v7).getTypesUnderEquality(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = com.google.javascript.rhino.jstype.ObjectType.cast(((com.google.javascript.rhino.jstype.JSType)v7));
    Object v18 = "\"";
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v17).getTemplatizedType(((java.lang.String)v18));
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "";
    Object v24 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),((java.lang.String)v23));
    Object v25 = "call";
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v24).getTemplatizedType(((java.lang.String)v25));
    Object v27 = com.google.javascript.rhino.jstype.JSType.isEquivalent(((com.google.javascript.rhino.jstype.JSType)v19),((com.google.javascript.rhino.jstype.JSType)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "call";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = false;
    Object v8 = ((com.google.javascript.rhino.jstype.JSType)v6).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ",";
    Object v10 = ((com.google.javascript.rhino.jstype.ObjectType)v6).hasOwnProperty(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v7).findPropertyType(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.JSType)v7).isStringObjectType();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "";
    Object v9 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8));
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "";
    Object v14 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.lang.String)v13));
    Object v15 = "";
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).getTemplatizedType(((java.lang.String)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v9).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.JSType)v4).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v18).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).setLastGeneration((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "L";
    Object v6 = "";
    Object v7 = 9;
    Object v8 = 1;
    Object v9 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.NamedType)v9).isNominalType();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "";
    Object v9 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).getTemplatizedType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v4).getLeastSupertype(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "";
    Object v17 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v17).collapseUnion();
    Object v19 = ((com.google.javascript.rhino.jstype.ObjectType)v18).isObject();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v12).equals(((java.lang.Object)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v7).collapseUnion();
    Object v9 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v8).toMaybeUnionType();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).collapseUnion();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isNominalConstructor();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getPropertiesCount();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = "";
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "";
    Object v15 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.google.javascript.rhino.jstype.SimpleSlot(((java.lang.String)v10),((com.google.javascript.rhino.jstype.JSType)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.StaticSlot)v17).getName();
    Object v19 = "";
    Object v20 = ((com.google.javascript.rhino.jstype.NamedType)v7).getTypedefType(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticSlot)v17),((java.lang.String)v19));
    Object v21 = "./";
    Object v22 = ((com.google.javascript.rhino.jstype.ObjectType)v20).hasProperty(((java.lang.String)v21));
    Object v23 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v20).getParameterType();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "_S";
    Object v12 = "s";
    Object v13 = 2;
    Object v14 = -12;
    Object v15 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v7).canCastTo(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.NamedType)v7).getReferencedType();
    Object v18 = ((com.google.javascript.rhino.jstype.ObjectType)v17).getRootNode();
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v4).collapseUnion();
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v5).isEmptyType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).getTemplatizedType(((java.lang.String)v5));
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.JSType)v6).isEquivalentTo(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.JSType)v6).toObjectType();
    Object v14 = "";
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).getTemplatizedType(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v13).isRecordType();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    ((com.google.javascript.rhino.jstype.ObjectType)v4).clearCachedValues();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "}";
    Object v6 = ((com.google.javascript.rhino.jstype.ObjectType)v4).isPropertyTypeDeclared(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    Object v4 = new com.google.javascript.rhino.jstype.TemplateType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3));
    Object v5 = "goog.requir";
    Object v6 = ((com.google.javascript.rhino.jstype.JSType)v4).hasTemplatizedType(((java.lang.String)v5));
    Object v7 = com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(((com.google.javascript.rhino.jstype.JSType)v4));
    Object v8 = ((com.google.javascript.rhino.jstype.ProxyObjectType)v7).collapseUnion();
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isFunctionType();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "_S";
    Object v12 = "s";
    Object v13 = 2;
    Object v14 = -12;
    Object v15 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v7).canCastTo(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.NamedType)v7).getReferencedType();
    Object v18 = "TightenTypes pass apears to be stuck in an infinite loop.";
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v17).hasTemplatizedType(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v17).autobox();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "_S";
    Object v4 = "s";
    Object v5 = 2;
    Object v6 = -12;
    Object v7 = new com.google.javascript.rhino.jstype.NamedType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.ObjectType)v7).getPropertyNames();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = "";
    Object v11 = "";
    Object v12 = 1;
    Object v13 = -22;
    ((com.google.javascript.rhino.ErrorReporter)v9).warning(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.UnknownType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.google.javascript.rhino.jstype.NamedType)v7).resolveInternal(((com.google.javascript.rhino.ErrorReporter)v9),((com.google.javascript.rhino.jstype.StaticScope)v19));
    org.junit.Assert.assertNotNull(v20);
  }
}
