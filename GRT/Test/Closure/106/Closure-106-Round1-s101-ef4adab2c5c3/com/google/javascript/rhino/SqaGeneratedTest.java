package com.google.javascript.rhino;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordPreserveTry();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordTypedef(((com.google.javascript.rhino.JSTypeExpression)v7));
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v10),((java.lang.String)v11),((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordThisType(((com.google.javascript.rhino.JSTypeExpression)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "b";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).build(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "argument";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordReturnDescription(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordNoAlias();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordNoTypeCheck();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).isDescriptionRecorded();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordConstancy();
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordInterface();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSTypeExpression)v7).hashCode();
    Object v9 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordThisType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "String";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordFileOverview(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordImplicitCast();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordImplementedInterface(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "graph";
    Object v3 = 30;
    Object v4 = 82;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markAnnotation(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = -4;
    Object v4 = 1;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "s";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDeprecationReason(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordVisibility(((com.google.javascript.rhino.JSDocInfo.Visibility)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordOverride();
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordNoShadow();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDefineType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "N";
    Object v3 = 22;
    Object v4 = -8;
    Object v5 = 0;
    Object v6 = 58;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markText(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordConstructor();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v9 = ((com.google.javascript.rhino.JSTypeExpression)v7).equals(((java.lang.Object)v8));
    Object v10 = "+";
    Object v11 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordThrowDescription(((com.google.javascript.rhino.JSTypeExpression)v7),((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordVersion(((java.lang.String)v2));
    Object v4 = " ";
    Object v5 = 0;
    Object v6 = -26;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markName(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "\\";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordVersion(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordConstancy();
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordConstructor();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = -16;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = false;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markTypeNode(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDeprecated();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordHiddenness();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "msg.jsdoc";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordVersion(((java.lang.String)v2));
    Object v4 = "}";
    Object v5 = com.google.javascript.rhino.Node.newString(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7));
    Object v9 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v5),((java.lang.String)v6),((com.google.javascript.rhino.jstype.JSTypeRegistry)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordThrowDescription(((com.google.javascript.rhino.JSTypeExpression)v9),((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "?";
    Object v3 = "rototype";
    Object v4 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordParameterDescription(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "g";
    Object v3 = "";
    Object v4 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordParameterDescription(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.ArrayList();
    Object v3 = new java.util.TreeSet(((java.util.Collection)v2));
    Object v4 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v5 = ((java.util.Set)v3).equals(((java.lang.Object)v4));
    Object v6 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordSuppressions(((java.util.Set)v3));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordThisType(((com.google.javascript.rhino.JSTypeExpression)v7));
    Object v9 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordVisibility(((com.google.javascript.rhino.JSDocInfo.Visibility)v9));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "#";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).addReference(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).isConstructorRecorded();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordBaseType(((com.google.javascript.rhino.JSTypeExpression)v7));
    Object v9 = "\n";
    Object v10 = 2;
    Object v11 = -4;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markName(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "?";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).addAuthor(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDefineType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDescription(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordOverride();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordImplicitCast();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.google.javascript.rhino.JSTypeExpression)v7).equals(((java.lang.Object)v9));
    Object v11 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordTypedef(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).isDescriptionRecorded();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ".prototype.";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordFileOverview(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordInterface();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordNoSideEffects();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordHiddenness();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordConstructor();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordNoAlias();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = " does not exist in graph";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordTemplateTypeName(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "string";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).addReference(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = 8;
    Object v5 = -24;
    Object v6 = 0;
    Object v7 = true;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markTypeNode(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordEnumParameterType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordBlockDescription(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordBaseType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSTypeExpression)v7).hashCode();
    Object v9 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDefineType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).isPopulatedWithFileOverview();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "b";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordBlockDescription(((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordExport();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordVersion(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordPreserveTry();
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordExport();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordExport();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "(";
    Object v3 = "}";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v4),((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordParameter(((java.lang.String)v2),((com.google.javascript.rhino.JSTypeExpression)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "TEMPLATE";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordTemplateTypeName(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "Node must be a call.";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordReturnDescription(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordOverride();
    Object v3 = "}";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v4),((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordReturnType(((com.google.javascript.rhino.JSTypeExpression)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = " & ";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDeprecationReason(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordConstructor();
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordNoShadow();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordNoShadow();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordConstancy();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordTypedef(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "JSC_INPUT_MAP_PR6OP_PARSE";
    Object v3 = "}";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v4),((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordParameter(((java.lang.String)v2),((com.google.javascript.rhino.JSTypeExpression)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "JSC_UNRESOLBED_TYPE";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDeprecationReason(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordReturnType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordVisibility(((com.google.javascript.rhino.JSDocInfo.Visibility)v2));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "J";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).addReference(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordNoAlias();
    Object v3 = "}";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6));
    Object v8 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v4),((java.lang.String)v5),((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordBaseType(((com.google.javascript.rhino.JSTypeExpression)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordConstructor();
    Object v3 = ",W";
    Object v4 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).build(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordPreserveTry();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordType(((com.google.javascript.rhino.JSTypeExpression)v7));
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v10),((java.lang.String)v11),((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordBaseType(((com.google.javascript.rhino.JSTypeExpression)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "null";
    Object v3 = 1;
    Object v4 = -3;
    Object v5 = -30;
    Object v6 = 0;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markText(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.util.ArrayList();
    Object v3 = new java.util.TreeSet(((java.util.Collection)v2));
    Object v4 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordSuppressions(((java.util.Set)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = false;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = 1;
    Object v4 = 0;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markName(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "5";
    Object v9 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordThrowDescription(((com.google.javascript.rhino.JSTypeExpression)v7),((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDeprecated();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "g.";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDeprecationReason(((java.lang.String)v2));
    Object v4 = "B";
    Object v5 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDeprecationReason(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "oolean";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).hasParameter(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordVersion(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordThisType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = true;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markTypeNode(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordImplementedInterface(((com.google.javascript.rhino.JSTypeExpression)v7));
    Object v9 = "}";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12));
    Object v14 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v10),((java.lang.String)v11),((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordImplementedInterface(((com.google.javascript.rhino.JSTypeExpression)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSTypeExpression)v7).hashCode();
    Object v9 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordBaseType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "Access to protected property {0} of {1} not allowed here.";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordTemplateTypeName(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = 32;
    Object v7 = true;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markTypeNode(((com.google.javascript.rhino.Node)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "oog.LOCALE";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).addReference(((java.lang.String)v2));
    Object v4 = ".prottype.";
    Object v5 = 1;
    Object v6 = 0;
    ((com.google.javascript.rhino.JSDocInfoBuilder)v1).markAnnotation(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordConstructor();
    Object v3 = "JSC_CANNOT_PARSE_GENERATED_CODE";
    Object v4 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDescription(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordVisibility(((com.google.javascript.rhino.JSDocInfo.Visibility)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDeprecationReason(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = false;
    Object v9 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "\\";
    Object v11 = ((com.google.javascript.rhino.JSDocInfoBuilder)v9).recordVersion(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.JSTypeExpression)v7).equals(((java.lang.Object)v11));
    Object v13 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDefineType(((com.google.javascript.rhino.JSTypeExpression)v7));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "}";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.rhino.JSTypeExpression(((com.google.javascript.rhino.Node)v3),((java.lang.String)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordDefineType(((com.google.javascript.rhino.JSTypeExpression)v7));
    Object v9 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).recordInterface();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = true;
    Object v1 = new com.google.javascript.rhino.JSDocInfoBuilder((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "(";
    Object v3 = ((com.google.javascript.rhino.JSDocInfoBuilder)v1).addReference(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }
}
