package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).getDelegateRelationship(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v3).useSourceInfoFrom(((com.google.javascript.rhino.Node)v6));
    Object v8 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getSingletonGetterClassName(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).describeFunctionBind(((com.google.javascript.rhino.Node)v3));
    Object v5 = "/";
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = false;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isValidEnumKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfRequire(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = "@";
    Object v9 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPrivate(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).identifyTypeDeclarationCall(((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPropertyTestFunction(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "Illegal annotation on {0}. @implicitCast may only be used in externs.";
    Object v2 = true;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getClassesDefinedByCall(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = -12;
    ((com.google.javascript.rhino.Node)v3).setType((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).identifyTypeDeclarationCall(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).removeChildren();
    Object v5 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).describeFunctionBind(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "default";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isValidEnumKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "else4";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isConstant(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfRequire(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = "D";
    Object v9 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isSuperClassReference(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "@";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isConstantKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ".prototype";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = java.util.logging.Logger.getGlobal();
    Object v3 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.util.logging.Logger)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = java.util.logging.Logger.getGlobal();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = new com.google.javascript.jscomp.CheckMissingReturn(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getObjectLiteralCast(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).identifyTypeDeclarationCall(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).getDelegateSuperclassName();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isSuperClassReference(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPropertyTestFunction(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getAbstractMethodName();
    org.junit.Assert.assertEquals((Object)("goog.abstractMethod"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "CONSTANTS_ONLY";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v6).getString();
    Object v8 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).describeFunctionBind(((com.google.javascript.rhino.Node)v3));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isVarArgsParameter(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).describeFunctionBind(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).wasEmptyNode();
    Object v15 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfRequire(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v13));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).removeFirstChild();
    Object v5 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getSingletonGetterClassName(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "k";
    Object v2 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isSuperClassReference(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getExportPropertyFunction();
    org.junit.Assert.assertEquals((Object)("goog.exportProperty"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getSingletonGetterClassName(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "duplicate";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isValidEnumKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "String";
    Object v2 = false;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPropertyTestFunction(((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).cloneTree();
    Object v12 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPropertyTestFunction(((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isConstantKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).describeFunctionBind(((com.google.javascript.rhino.Node)v3));
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getSingletonGetterClassName(((com.google.javascript.rhino.Node)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).isLocalResultCall();
    Object v12 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).identifyTypeDeclarationCall(((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getGlobalObject();
    org.junit.Assert.assertEquals((Object)("goog.global"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getAssertionFunctions();
    Object v2 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v3 = java.util.logging.Logger.getGlobal();
    Object v4 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v2),((java.util.logging.Logger)v3));
    Object v5 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v4));
    Object v6 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v7 = java.util.logging.Logger.getGlobal();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v6),((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v11 = new com.google.javascript.jscomp.CheckMissingReturn(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v12 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v5),((com.google.javascript.jscomp.NodeTraversal.Callback)v11));
    Object v13 = 1;
    Object v14 = "H";
    Object v15 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getObjectLiteralCast(((com.google.javascript.jscomp.NodeTraversal)v12),((com.google.javascript.rhino.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "v";
    Object v2 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPrivate(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "W";
    Object v2 = false;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v5 = java.util.logging.Logger.getGlobal();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v4),((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v9 = java.util.logging.Logger.getGlobal();
    Object v10 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v8),((java.util.logging.Logger)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v10));
    Object v12 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v13 = new com.google.javascript.jscomp.CheckMissingReturn(((com.google.javascript.jscomp.AbstractCompiler)v11),((com.google.javascript.jscomp.CheckLevel)v12));
    Object v14 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v13));
    Object v15 = 1;
    Object v16 = "H";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getObjectLiteralCast(((com.google.javascript.jscomp.NodeTraversal)v14),((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "protot<pe";
    Object v2 = true;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getInputId();
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getSingletonGetterClassName(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "?";
    Object v2 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isSuperClassReference(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).identifyTypeDeclarationCall(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = true;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).describeFunctionBind(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getAssertionFunctions();
    Object v2 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getExportPropertyFunction();
    org.junit.Assert.assertEquals((Object)("goog.exportProperty"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isOptionalParameter(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isConstant(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).toStringTree();
    Object v5 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getSingletonGetterClassName(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = "NUMBER ";
    Object v9 = false;
    Object v10 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ".";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isValidEnumKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = true;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfRequire(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.rhino.Node)v10).removeFirstChild();
    Object v12 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).identifyTypeDeclarationCall(((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).cloneTree();
    Object v5 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).identifyTypeDeclarationCall(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v3).addChildrenToFront(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getClassesDefinedByCall(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).extractClassNameIfRequire(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = "SEARCHING_NEWLIN%E";
    Object v9 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfRequire(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = "H";
    Object v13 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    ((com.google.javascript.rhino.Node)v10).addChildToBack(((com.google.javascript.rhino.Node)v13));
    Object v14 = null;
    Object v15 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPropertyTestFunction(((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isVarArgsParameter(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isValidEnumKey(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).getLength();
    Object v5 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPropertyTestFunction(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).hasSideEffects();
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfRequire(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "U";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isValidEnumKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = java.util.logging.Logger.getGlobal();
    Object v3 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.util.logging.Logger)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = java.util.logging.Logger.getGlobal();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = new com.google.javascript.jscomp.CheckMissingReturn(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = new java.util.TreeSet();
    Object v13 = new java.util.ArrayList(((java.util.Collection)v12));
    ((com.google.javascript.jscomp.NodeTraversal)v11).traverseRoots(((java.util.List)v13));
    Object v14 = null;
    Object v15 = 1;
    Object v16 = "H";
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16));
    Object v18 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getObjectLiteralCast(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = java.util.logging.Logger.getGlobal();
    Object v3 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.util.logging.Logger)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = java.util.logging.Logger.getGlobal();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = new com.google.javascript.jscomp.CheckMissingReturn(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 0;
    ((com.google.javascript.rhino.Node)v14).removeProp((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getObjectLiteralCast(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v5 = "U";
    Object v6 = ((com.google.javascript.jscomp.DefaultCodingConvention)v4).isValidEnumKey(((java.lang.String)v5));
    Object v7 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v8 = "@";
    Object v9 = ((com.google.javascript.jscomp.DefaultCodingConvention)v7).isConstantKey(((java.lang.String)v8));
    Object v10 = new java.util.TreeSet();
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = new java.util.TreeSet();
    Object v13 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v14 = "else4";
    Object v15 = ((com.google.javascript.jscomp.DefaultCodingConvention)v13).isConstant(((java.lang.String)v14));
    Object v16 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v17 = "k";
    Object v18 = ((com.google.javascript.jscomp.ClosureCodingConvention)v16).isSuperClassReference(((java.lang.String)v17));
    Object v19 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v20 = ((com.google.javascript.jscomp.ClosureCodingConvention)v19).getAssertionFunctions();
    Object v21 = ((com.google.javascript.jscomp.ClosureCodingConvention)v19).getExportPropertyFunction();
    Object v22 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v23 = "v";
    Object v24 = ((com.google.javascript.jscomp.ClosureCodingConvention)v22).isPrivate(((java.lang.String)v23));
    Object v25 = java.util.Map.of(((java.lang.Object)v6),((java.lang.Object)v9),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v15),((java.lang.Object)v18),((java.lang.Object)v21),((java.lang.Object)v24));
    ((com.google.javascript.jscomp.DefaultCodingConvention)v0).checkForCallingConventionDefiningCalls(((com.google.javascript.rhino.Node)v3),((java.util.Map)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getAssertionFunctions();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getExportSymbolFunction();
    org.junit.Assert.assertEquals((Object)("goog.exportSymbol"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = -38;
    ((com.google.javascript.rhino.Node)v3).setType((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isVarArgsParameter(((com.google.javascript.rhino.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPropertyTestFunction(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "V";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "W";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "JSCompiler_renameProperty";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "-";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isConstant(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "prototype";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ", ";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getGlobalObject();
    org.junit.Assert.assertEquals((Object)("goog.global"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    Object v8 = 1;
    Object v9 = "H";
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v11 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getClassesDefinedByCall(((com.google.javascript.rhino.Node)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "eval";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPropertyTestFunction(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).cloneNode();
    Object v5 = 1;
    Object v6 = "H";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfProvide(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "4";
    Object v2 = true;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getClassesDefinedByCall(((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "\"";
    Object v2 = true;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "6";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isValidEnumKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).extractClassNameIfRequire(((com.google.javascript.rhino.Node)v3),((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "function";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "}";
    Object v2 = false;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "set";
    Object v2 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isSuperClassReference(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "H";
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getSingletonGetterClassName(((com.google.javascript.rhino.Node)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "N";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    Object v3 = "s";
    Object v4 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "4";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "this";
    Object v2 = true;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "}";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isValidEnumKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isSuperClassReference(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "s";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isValidEnumKey(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = java.util.logging.Logger.getGlobal();
    Object v3 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.util.logging.Logger)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = java.util.logging.Logger.getGlobal();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = new com.google.javascript.jscomp.CheckMissingReturn(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = 0;
    ((com.google.javascript.rhino.Node)v14).setLineno((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getObjectLiteralCast(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "j";
    Object v2 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v2 = java.util.logging.Logger.getGlobal();
    Object v3 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v1),((java.util.logging.Logger)v2));
    Object v4 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v3));
    Object v5 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
    Object v6 = java.util.logging.Logger.getGlobal();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((com.google.javascript.jscomp.MessageFormatter)v5),((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v10 = new com.google.javascript.jscomp.CheckMissingReturn(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.CheckLevel)v9));
    Object v11 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v4),((com.google.javascript.jscomp.NodeTraversal.Callback)v10));
    Object v12 = 1;
    Object v13 = "H";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v14).isNoSideEffectsCall();
    Object v16 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).getObjectLiteralCast(((com.google.javascript.jscomp.NodeTraversal)v11),((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = 1;
    Object v2 = "H";
    Object v3 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).wasEmptyNode();
    Object v5 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).identifyTypeDeclarationCall(((com.google.javascript.rhino.Node)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = "l";
    Object v2 = false;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = "H";
    Object v6 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.jscomp.ClosureCodingConvention)v0).isPropertyTestFunction(((com.google.javascript.rhino.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    Object v1 = ":";
    Object v2 = true;
    Object v3 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = ((com.google.javascript.jscomp.DefaultCodingConvention)v0).isExported(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }
}
