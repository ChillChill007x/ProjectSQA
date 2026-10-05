package com.google.javascript.rhino.jstype;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forConstructor();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "protot";
    Object v8 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.JSType)v8).isString();
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).copyFromOtherFunction(((com.google.javascript.rhino.jstype.FunctionType)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = " q= ";
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).equals(((java.lang.Object)v14));
    Object v16 = true;
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withReturnType(((com.google.javascript.rhino.jstype.JSType)v13),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "protot";
    Object v8 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = " q= ";
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((com.google.javascript.rhino.Node)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).build();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withParamsNode(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withParamsNode(((com.google.javascript.rhino.Node)v11));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = " q= ";
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "protot";
    Object v10 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = " q= ";
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((com.google.javascript.rhino.Node)v15),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v10).canAssignTo(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = false;
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withReturnType(((com.google.javascript.rhino.jstype.JSType)v10),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = "EOL";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withName(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = " q= ";
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).equals(((java.lang.Object)v14));
    Object v16 = true;
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withReturnType(((com.google.javascript.rhino.jstype.JSType)v13),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v17).build();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withParamsNode(((com.google.javascript.rhino.Node)v11));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = " q= ";
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v24 = true;
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v22).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "protot";
    Object v10 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withReturnType(((com.google.javascript.rhino.jstype.JSType)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "protot";
    Object v11 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withSourceNode(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = "";
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withTemplateName(((java.lang.String)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 1.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = " q= ";
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((com.google.javascript.rhino.Node)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v17).equals(((java.lang.Object)v18));
    Object v20 = true;
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withReturnType(((com.google.javascript.rhino.jstype.JSType)v17),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v21).build();
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forNativeType();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = "E";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).withTemplateName(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withParamsNode(((com.google.javascript.rhino.Node)v11));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = " q= ";
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.ObjectType)v21).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v23 = null;
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v21));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 1.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = " q= ";
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).build();
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = "): ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withTemplateName(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withSourceNode(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = " q= ";
    Object v25 = true;
    Object v26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21),((com.google.javascript.rhino.Node)v23),((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v18).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v18).build();
    Object v29 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withReturnType(((com.google.javascript.rhino.jstype.JSType)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withParamsNode(((com.google.javascript.rhino.Node)v11));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = " q= ";
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.ObjectType)v21).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v23 = null;
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v24).withSourceNode(((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).withTemplateName(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = " q= ";
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((com.google.javascript.rhino.Node)v15),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v18).equals(((java.lang.Object)v19));
    Object v21 = true;
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v10).withReturnType(((com.google.javascript.rhino.jstype.JSType)v18),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v22).build();
    Object v24 = true;
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withReturnType(((com.google.javascript.rhino.jstype.JSType)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = "msg.jsdoc.missing.rc";
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withName(((java.lang.String)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 1.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = " q= ";
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).build();
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v18).forNativeType();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = "): ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withTemplateName(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "";
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v11).withTemplateName(((java.lang.String)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = " q= ";
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v21).equals(((java.lang.Object)v22));
    Object v24 = true;
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withReturnType(((com.google.javascript.rhino.jstype.JSType)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v25).build();
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).copyFromOtherFunction(((com.google.javascript.rhino.jstype.FunctionType)v26));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = true;
    ((com.google.javascript.rhino.Node)v29).setWasEmptyNode((((java.lang.Boolean)v30).booleanValue()));
    Object v31 = null;
    Object v32 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withParamsNode(((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).build();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = "EOL";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withName(((java.lang.String)v6));
    Object v8 = ".";
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withTemplateName(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forConstructor();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).withTemplateName(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = " q= ";
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((com.google.javascript.rhino.Node)v15),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v18).equals(((java.lang.Object)v19));
    Object v21 = true;
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v10).withReturnType(((com.google.javascript.rhino.jstype.JSType)v18),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v22).build();
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "protot";
    Object v10 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 1.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = " q= ";
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((com.google.javascript.rhino.Node)v19),((java.lang.String)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withReturnType(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v23).build();
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v10).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "protot";
    Object v10 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 1.0D;
    Object v19 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()));
    Object v20 = " q= ";
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((com.google.javascript.rhino.Node)v19),((java.lang.String)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withReturnType(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v23).build();
    Object v25 = ((com.google.javascript.rhino.jstype.JSType)v10).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v10));
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v26).build();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    Object v7 = ((com.google.javascript.rhino.Node)v5).getAncestor((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withParamsNode(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).toStringTree();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withSourceNode(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withParamsNode(((com.google.javascript.rhino.Node)v11));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = " q= ";
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v24 = true;
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v22).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v26));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v27).withParamsNode(((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = 1.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).withParamsNode(((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withSourceNode(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = " q= ";
    Object v25 = true;
    Object v26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21),((com.google.javascript.rhino.Node)v23),((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v18).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v26));
    Object v28 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v18).build();
    Object v29 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withReturnType(((com.google.javascript.rhino.jstype.JSType)v28));
    Object v30 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v31 = true;
    Object v32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = " q= ";
    Object v36 = true;
    Object v37 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v32),((com.google.javascript.rhino.Node)v34),((java.lang.String)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v29).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = "E";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).withTemplateName(((java.lang.String)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "protot";
    Object v19 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = 1.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).withParamsNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v15).withTemplateName(((java.lang.String)v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = " q= ";
    Object v28 = true;
    Object v29 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24),((com.google.javascript.rhino.Node)v26),((java.lang.String)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v21).withReturnType(((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v30).build();
    Object v32 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v15).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withParamsNode(((com.google.javascript.rhino.Node)v11));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = " q= ";
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v21));
    Object v23 = 1.0D;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v24).toStringTree();
    Object v26 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v22).withSourceNode(((com.google.javascript.rhino.Node)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withTemplateName(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = "EOL";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withName(((java.lang.String)v6));
    Object v8 = ".";
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withTemplateName(((java.lang.String)v8));
    Object v10 = "prototype";
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withTemplateName(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forConstructor();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).withTemplateName(((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1.0D;
    Object v15 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()));
    Object v16 = " q= ";
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((com.google.javascript.rhino.Node)v15),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = ((com.google.javascript.rhino.jstype.JSType)v18).equals(((java.lang.Object)v19));
    Object v21 = true;
    Object v22 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v10).withReturnType(((com.google.javascript.rhino.jstype.JSType)v18),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v22).build();
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = "";
    Object v26 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v24).withName(((java.lang.String)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withSourceNode(((com.google.javascript.rhino.Node)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withParamsNode(((com.google.javascript.rhino.Node)v11));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "protot";
    Object v18 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((java.lang.String)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = 1.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).withParamsNode(((com.google.javascript.rhino.Node)v14));
    Object v16 = "";
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v15).withTemplateName(((java.lang.String)v16));
    Object v18 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v19 = true;
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = 1.0D;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()));
    Object v27 = " q= ";
    Object v28 = true;
    Object v29 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v24),((com.google.javascript.rhino.Node)v26),((java.lang.String)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v21).withReturnType(((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v30).build();
    Object v32 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v15).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v31));
    Object v33 = 1.0D;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()));
    Object v35 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v32).withSourceNode(((com.google.javascript.rhino.Node)v34));
    Object v36 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v32).build();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = "): ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withTemplateName(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "";
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v11).withTemplateName(((java.lang.String)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = " q= ";
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v21).equals(((java.lang.Object)v22));
    Object v24 = true;
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withReturnType(((com.google.javascript.rhino.jstype.JSType)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v25).build();
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).copyFromOtherFunction(((com.google.javascript.rhino.jstype.FunctionType)v26));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = true;
    ((com.google.javascript.rhino.Node)v29).setWasEmptyNode((((java.lang.Boolean)v30).booleanValue()));
    Object v31 = null;
    Object v32 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withParamsNode(((com.google.javascript.rhino.Node)v29));
    Object v33 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v34 = true;
    Object v35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v35));
    Object v37 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v32).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forConstructor();
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = " q= ";
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7),((com.google.javascript.rhino.Node)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setCharno((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withParamsNode(((com.google.javascript.rhino.Node)v5));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = " q= ";
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((com.google.javascript.rhino.Node)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).withReturnType(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v17).build();
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withReturnType(((com.google.javascript.rhino.jstype.JSType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withSourceNode(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).forConstructor();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = "protot";
    Object v20 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "protot";
    Object v11 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).forConstructor();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withSourceNode(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).forConstructor();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = "protot";
    Object v20 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = "}";
    Object v23 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v21).withName(((java.lang.String)v22));
    Object v24 = "_";
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v21).withName(((java.lang.String)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v18 = true;
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = 1.0D;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()));
    Object v22 = " q= ";
    Object v23 = true;
    Object v24 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v19),((com.google.javascript.rhino.Node)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v16).withReturnType(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v25).build();
    Object v27 = true;
    Object v28 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).withReturnType(((com.google.javascript.rhino.jstype.JSType)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).build();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "protot";
    Object v14 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withReturnType(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setCharno((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withParamsNode(((com.google.javascript.rhino.Node)v5));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "protot";
    Object v13 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((java.lang.String)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionType)v13).getMinArguments();
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).copyFromOtherFunction(((com.google.javascript.rhino.jstype.FunctionType)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withTemplateName(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withSourceNode(((com.google.javascript.rhino.Node)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "protot";
    Object v8 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forNativeType();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = " q= ";
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((com.google.javascript.rhino.Node)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withReturnType(((com.google.javascript.rhino.jstype.JSType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withSourceNode(((com.google.javascript.rhino.Node)v6));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withSourceNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "protot";
    Object v15 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14));
    Object v16 = true;
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withReturnType(((com.google.javascript.rhino.jstype.JSType)v15),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withTemplateName(((java.lang.String)v10));
    Object v12 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v13 = true;
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "protot";
    Object v16 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v14),((java.lang.String)v15));
    Object v17 = false;
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v11).withReturnType(((com.google.javascript.rhino.jstype.JSType)v16),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v7 = true;
    Object v8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "protot";
    Object v10 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v8),((java.lang.String)v9));
    Object v11 = false;
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withReturnType(((com.google.javascript.rhino.jstype.JSType)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = "";
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v16).withTemplateName(((java.lang.String)v17));
    Object v19 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = " q= ";
    Object v25 = true;
    Object v26 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v21),((com.google.javascript.rhino.Node)v23),((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v28 = ((com.google.javascript.rhino.jstype.JSType)v26).equals(((java.lang.Object)v27));
    Object v29 = true;
    Object v30 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v18).withReturnType(((com.google.javascript.rhino.jstype.JSType)v26),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v30).build();
    Object v32 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).withReturnType(((com.google.javascript.rhino.jstype.JSType)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    ((com.google.javascript.rhino.Node)v5).setCharno((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withParamsNode(((com.google.javascript.rhino.Node)v5));
    Object v9 = 1.0D;
    Object v10 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).withSourceNode(((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).build();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).toStringTree();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withSourceNode(((com.google.javascript.rhino.Node)v6));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.Node)v11).removeFirstChild();
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withParamsNode(((com.google.javascript.rhino.Node)v11));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = " q= ";
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.jstype.ObjectType)v21).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v22));
    Object v23 = null;
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v21));
    Object v25 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v26 = true;
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = "protot";
    Object v29 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v27),((java.lang.String)v28));
    Object v30 = "";
    Object v31 = ((com.google.javascript.rhino.jstype.FunctionType)v29).isPropertyTypeInferred(((java.lang.String)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v24).copyFromOtherFunction(((com.google.javascript.rhino.jstype.FunctionType)v29));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = "E";
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).withTemplateName(((java.lang.String)v13));
    Object v15 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v16 = true;
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "protot";
    Object v19 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v17),((java.lang.String)v18));
    Object v20 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v19));
    Object v21 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v22 = true;
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "protot";
    Object v8 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forNativeType();
    Object v11 = "";
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v10).withTemplateName(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = " q= ";
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((com.google.javascript.rhino.Node)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).withReturnType(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v17).build();
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withReturnType(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v19).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = "): ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withTemplateName(((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = "";
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v11).withTemplateName(((java.lang.String)v12));
    Object v14 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = 1.0D;
    Object v18 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v17).doubleValue()));
    Object v19 = " q= ";
    Object v20 = true;
    Object v21 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v16),((com.google.javascript.rhino.Node)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v23 = ((com.google.javascript.rhino.jstype.JSType)v21).equals(((java.lang.Object)v22));
    Object v24 = true;
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v13).withReturnType(((com.google.javascript.rhino.jstype.JSType)v21),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v25).build();
    Object v27 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).copyFromOtherFunction(((com.google.javascript.rhino.jstype.FunctionType)v26));
    Object v28 = 1.0D;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()));
    Object v30 = true;
    ((com.google.javascript.rhino.Node)v29).setWasEmptyNode((((java.lang.Boolean)v30).booleanValue()));
    Object v31 = null;
    Object v32 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withParamsNode(((com.google.javascript.rhino.Node)v29));
    Object v33 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v32).forNativeType();
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withSourceNode(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).forConstructor();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = "protot";
    Object v20 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v21).withParamsNode(((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withSourceNode(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).forConstructor();
    Object v16 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v17 = true;
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = "protot";
    Object v20 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v18),((java.lang.String)v19));
    Object v21 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v14).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v20));
    Object v22 = 1.0D;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v21).withParamsNode(((com.google.javascript.rhino.Node)v23));
    Object v25 = "";
    Object v26 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v24).withName(((java.lang.String)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).toStringTree();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withSourceNode(((com.google.javascript.rhino.Node)v6));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v11).checkTreeEquals(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withSourceNode(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v8 = true;
    Object v9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = " q= ";
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((com.google.javascript.rhino.Node)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v11));
    Object v13 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).withParams(((com.google.javascript.rhino.jstype.FunctionParamBuilder)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = " ";
    Object v4 = "";
    Object v5 = 22;
    Object v6 = 1;
    Object v7 = ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).createNamedType(((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "protot";
    Object v8 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forNativeType();
    Object v11 = "T";
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v10).withTemplateName(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forNativeType();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v6 = true;
    Object v7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v7));
    Object v9 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v10 = true;
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = " q= ";
    Object v15 = true;
    Object v16 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v11),((com.google.javascript.rhino.Node)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).withReturnType(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v17).build();
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withReturnType(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v25 = true;
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = 1.0D;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()));
    Object v29 = " q= ";
    Object v30 = true;
    Object v31 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v26),((com.google.javascript.rhino.Node)v28),((java.lang.String)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v23).withReturnType(((com.google.javascript.rhino.jstype.JSType)v31));
    Object v33 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v32).build();
    Object v34 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v19).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "protot";
    Object v8 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forNativeType();
    Object v11 = "T";
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v10).withTemplateName(((java.lang.String)v11));
    Object v13 = 1.0D;
    Object v14 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v12).withSourceNode(((com.google.javascript.rhino.Node)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = "): ";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withTemplateName(((java.lang.String)v6));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withParamsNode(((com.google.javascript.rhino.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    Object v7 = ((com.google.javascript.rhino.Node)v5).getAncestor((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withParamsNode(((com.google.javascript.rhino.Node)v5));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withSourceNode(((com.google.javascript.rhino.Node)v5));
    Object v7 = 1.0D;
    Object v8 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v6).withSourceNode(((com.google.javascript.rhino.Node)v8));
    Object v10 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v11 = true;
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "protot";
    Object v14 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v12),((java.lang.String)v13));
    Object v15 = new com.google.javascript.rhino.JSDocInfo();
    Object v16 = ((com.google.javascript.rhino.jstype.JSType)v14).equals(((java.lang.Object)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "parenthesFzed";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = "EOL";
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withName(((java.lang.String)v6));
    Object v8 = "=";
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withTemplateName(((java.lang.String)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).forNativeType();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.Node)v6).toStringTree();
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withSourceNode(((com.google.javascript.rhino.Node)v6));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((com.google.javascript.rhino.Node)v11).checkTreeEquals(((com.google.javascript.rhino.Node)v13));
    Object v15 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withSourceNode(((com.google.javascript.rhino.Node)v11));
    Object v16 = 1.0D;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v15).withParamsNode(((com.google.javascript.rhino.Node)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "protot";
    Object v8 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6),((java.lang.String)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withReturnType(((com.google.javascript.rhino.jstype.JSType)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).forNativeType();
    Object v11 = 1.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v10).withParamsNode(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v5 = true;
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v9 = true;
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 1.0D;
    Object v12 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v11).doubleValue()));
    Object v13 = " q= ";
    Object v14 = true;
    Object v15 = new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(((com.google.javascript.rhino.jstype.JSTypeRegistry)v10),((com.google.javascript.rhino.Node)v12),((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withInferredReturnType(((com.google.javascript.rhino.jstype.JSType)v15));
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).build();
    Object v18 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v17));
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v18).forNativeType();
    Object v20 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v21 = true;
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "protot";
    Object v24 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v22),((java.lang.String)v23));
    Object v25 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v19).withTypeOfThis(((com.google.javascript.rhino.jstype.ObjectType)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).forNativeType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withTemplateName(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v11).forConstructor();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.google.javascript.rhino.jstype.JSTypeRegistry)v2).clearTemplateTypeName();
    Object v3 = null;
    Object v4 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v5 = 1.0D;
    Object v6 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v4).withSourceNode(((com.google.javascript.rhino.Node)v6));
    Object v8 = 1.0D;
    Object v9 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withSourceNode(((com.google.javascript.rhino.Node)v9));
    Object v11 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v12 = true;
    Object v13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "protot";
    Object v15 = new com.google.javascript.rhino.jstype.ErrorFunctionType(((com.google.javascript.rhino.jstype.JSTypeRegistry)v13),((java.lang.String)v14));
    Object v16 = true;
    Object v17 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v7).withReturnType(((com.google.javascript.rhino.jstype.JSType)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "";
    Object v19 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v17).withName(((java.lang.String)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = 1.0D;
    Object v5 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    Object v7 = ((com.google.javascript.rhino.Node)v5).getAncestor((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withParamsNode(((com.google.javascript.rhino.Node)v5));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = 1.0D;
    Object v11 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withParamsNode(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino();
    Object v1 = true;
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.google.javascript.rhino.jstype.FunctionBuilder(((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = "";
    Object v5 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v3).withTemplateName(((java.lang.String)v4));
    Object v6 = 1.0D;
    Object v7 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v5).withSourceNode(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v8).forNativeType();
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v9).withTemplateName(((java.lang.String)v10));
    Object v12 = "undefined";
    Object v13 = ((com.google.javascript.rhino.jstype.FunctionBuilder)v11).withName(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }
}
