package com.google.javascript.jscomp.type;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = null;
    Object v10 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = null;
    Object v6 = true;
    Object v7 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v3).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.type.FlowScope)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = null;
    Object v5 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v5 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v13));
    Object v15 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v9 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v8));
    Object v10 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v11 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v11));
    Object v13 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v10),((com.google.javascript.rhino.jstype.JSTypeRegistry)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v14));
    Object v17 = ((com.google.javascript.rhino.jstype.JSType)v9).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v16));
    Object v18 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = null;
    Object v5 = com.google.javascript.rhino.IR.nullNode();
    Object v6 = com.google.javascript.rhino.IR.nullNode();
    ((com.google.javascript.rhino.Node)v5).addChildToFront(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v12),((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v22));
    ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).declareNameInScope(((com.google.javascript.jscomp.type.FlowScope)v4),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.JSType)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v8));
    Object v11 = "j";
    Object v12 = false;
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v34 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v34));
    Object v36 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v33),((com.google.javascript.rhino.jstype.JSTypeRegistry)v35));
    Object v37 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v36));
    Object v38 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v19 = ((java.lang.Enum)v18).getDeclaringClass();
    Object v20 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v18));
    Object v21 = "FUNCTION";
    Object v22 = false;
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v20),((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v19 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v18));
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22));
    Object v24 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v21),((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v24).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v25));
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v19).forceResolve(((com.google.javascript.rhino.ErrorReporter)v20),((com.google.javascript.rhino.jstype.StaticScope)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v19 = ((java.lang.Enum)v18).getDeclaringClass();
    Object v20 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v18));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = com.google.javascript.rhino.IR.nullNode();
    Object v30 = ((com.google.javascript.rhino.Node)v29).getStaticSourceFile();
    Object v31 = null;
    Object v32 = true;
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).nextPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.type.FlowScope)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v27),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29));
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v12),((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22));
    Object v24 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v21),((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v24));
    Object v26 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v27 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v26),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v29));
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v8));
    Object v11 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v23 = ((java.lang.Enum)v22).getDeclaringClass();
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v22));
    Object v25 = "FUNCTION";
    Object v26 = false;
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v27),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29));
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32));
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v33).getFirst();
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v27));
    Object v29 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v30 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v29),((com.google.javascript.rhino.jstype.JSTypeRegistry)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v34 = ((java.lang.Enum)v33).getDeclaringClass();
    Object v35 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v33));
    Object v36 = ((com.google.javascript.rhino.jstype.JSType)v28).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v35));
    Object v37 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v28));
    Object v38 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v18 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v24 = ((java.lang.Enum)v23).getDeclaringClass();
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v23));
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v18).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v33 = ((java.lang.Enum)v32).getDeclaringClass();
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v32));
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v27).getGreatestSubtype(((com.google.javascript.rhino.jstype.JSType)v34));
    Object v36 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v27));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v19 = ((java.lang.Enum)v18).getDeclaringClass();
    Object v20 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v18));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v33 = ((java.lang.Enum)v32).getDeclaringClass();
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v32));
    Object v35 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v34));
    Object v36 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v18 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v17));
    Object v19 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v18));
    Object v20 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = null;
    Object v6 = false;
    Object v7 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).nextPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.type.FlowScope)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = com.google.javascript.rhino.IR.nullNode();
    Object v25 = null;
    Object v26 = false;
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).nextPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v24),((com.google.javascript.jscomp.type.FlowScope)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = com.google.javascript.rhino.IR.nullNode();
    Object v5 = null;
    Object v6 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getTypeIfRefinable(((com.google.javascript.rhino.Node)v4),((com.google.javascript.jscomp.type.FlowScope)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v23 = ((java.lang.Enum)v22).getDeclaringClass();
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v22));
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = "";
    Object v27 = true;
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v29 = ((java.lang.Enum)v28).getDeclaringClass();
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v28));
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v23 = ((java.lang.Enum)v22).getDeclaringClass();
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v22));
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v12),((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22));
    Object v24 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v21),((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v24));
    Object v26 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v27 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v26),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v29));
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32));
    Object v34 = com.google.javascript.rhino.IR.nullNode();
    Object v35 = null;
    Object v36 = false;
    Object v37 = ((com.google.javascript.jscomp.type.ReverseAbstractInterpreter)v33).getPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v34),((com.google.javascript.jscomp.type.FlowScope)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = com.google.javascript.rhino.IR.nullNode();
    Object v30 = null;
    Object v31 = false;
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).nextPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.type.FlowScope)v30),(((java.lang.Boolean)v31).booleanValue()));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v23 = ((java.lang.Enum)v22).getDeclaringClass();
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v22));
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v8));
    Object v11 = "";
    Object v12 = true;
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v19 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v18));
    Object v20 = "*";
    Object v21 = false;
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v19),((java.lang.String)v20),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v12),((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v22));
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v25 = "T";
    Object v26 = false;
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = com.google.javascript.rhino.IR.nullNode();
    Object v30 = null;
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).getTypeIfRefinable(((com.google.javascript.rhino.Node)v29),((com.google.javascript.jscomp.type.FlowScope)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v27),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29));
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32));
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v33).getFirst();
    Object v35 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v36 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v36));
    Object v38 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v35),((com.google.javascript.rhino.jstype.JSTypeRegistry)v37));
    Object v39 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v34).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v23 = ((java.lang.Enum)v22).getDeclaringClass();
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v22));
    Object v25 = "j";
    Object v26 = false;
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = "F";
    Object v29 = true;
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v27),((java.lang.String)v28),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
    Object v10 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v12),((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v27 = ((java.lang.Enum)v26).getDeclaringClass();
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v26));
    Object v29 = "FUNCTION";
    Object v30 = false;
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v28),((java.lang.String)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v31));
    Object v33 = ((com.google.javascript.rhino.jstype.JSType)v32).getPossibleToBooleanOutcomes();
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v32));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v9 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v8));
    Object v10 = "";
    Object v11 = ((com.google.javascript.rhino.jstype.JSType)v9).findPropertyType(((java.lang.String)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v12),((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v27 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v26),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v29));
    Object v31 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v32 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v32));
    Object v34 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v31),((com.google.javascript.rhino.jstype.JSTypeRegistry)v33));
    Object v35 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v30).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v34));
    Object v36 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v35));
    Object v37 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v36));
    Object v38 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v33 = ((java.lang.Enum)v32).getDeclaringClass();
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v32));
    Object v35 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v34));
    Object v36 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v30 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v29),((com.google.javascript.rhino.jstype.JSTypeRegistry)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v30 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v29),((com.google.javascript.rhino.jstype.JSTypeRegistry)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32));
    Object v34 = com.google.javascript.rhino.IR.nullNode();
    Object v35 = null;
    Object v36 = true;
    Object v37 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v33).nextPreciserScopeKnowingConditionOutcome(((com.google.javascript.rhino.Node)v34),((com.google.javascript.jscomp.type.FlowScope)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v30 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v29),((com.google.javascript.rhino.jstype.JSTypeRegistry)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v33));
    Object v35 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v29 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v28));
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v29));
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v33 = ((java.lang.Enum)v32).getDeclaringClass();
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v32));
    Object v35 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v34));
    Object v36 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v23));
    Object v25 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v26 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26));
    Object v28 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v25),((com.google.javascript.rhino.jstype.JSTypeRegistry)v27));
    Object v29 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v30 = ((java.lang.Enum)v29).getDeclaringClass();
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v29));
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v24).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v33));
    Object v35 = " ";
    Object v36 = false;
    Object v37 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v34),((java.lang.String)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v23 = ((java.lang.Enum)v22).getDeclaringClass();
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v22));
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v26 = "boolean";
    Object v27 = true;
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v27),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29));
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32));
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v33).getFirst();
    Object v35 = com.google.javascript.rhino.IR.nullNode();
    Object v36 = null;
    Object v37 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v34).getTypeIfRefinable(((com.google.javascript.rhino.Node)v35),((com.google.javascript.jscomp.type.FlowScope)v36));
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v33));
    Object v35 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v19 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v18));
    Object v20 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getFirst();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v27),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29));
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32));
    Object v34 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v35 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v35));
    Object v37 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v34),((com.google.javascript.rhino.jstype.JSTypeRegistry)v36));
    Object v38 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v33).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).getFirst();
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v29 = ((java.lang.Enum)v28).getDeclaringClass();
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v28));
    Object v31 = "";
    Object v32 = false;
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v30),((java.lang.String)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v30 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v29),((com.google.javascript.rhino.jstype.JSTypeRegistry)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v33));
    Object v35 = "*";
    Object v36 = false;
    Object v37 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v34),((java.lang.String)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v30 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v29),((com.google.javascript.rhino.jstype.JSTypeRegistry)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v33));
    Object v35 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v34));
    Object v36 = "";
    Object v37 = true;
    Object v38 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v35),((java.lang.String)v36),(((java.lang.Boolean)v37).booleanValue()));
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = null;
    Object v10 = com.google.javascript.rhino.IR.nullNode();
    Object v11 = com.google.javascript.rhino.IR.nullNode();
    Object v12 = ((com.google.javascript.rhino.Node)v10).useSourceInfoFrom(((com.google.javascript.rhino.Node)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v18 = ((java.lang.Enum)v17).getDeclaringClass();
    Object v19 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v17));
    ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).declareNameInScope(((com.google.javascript.jscomp.type.FlowScope)v9),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.JSType)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getFirst();
    Object v16 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v16),((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v21 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21));
    Object v23 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v20),((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v24));
    Object v26 = "";
    Object v27 = ((com.google.javascript.rhino.jstype.JSType)v25).findPropertyType(((java.lang.String)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v19).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v25));
    Object v29 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN;
    Object v16 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v20 = ((java.lang.Enum)v19).getDeclaringClass();
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v19));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v29 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v28));
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v32));
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v33));
    Object v35 = ((com.google.javascript.rhino.jstype.JSType)v34).isGlobalThisType();
    Object v36 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v34));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v12));
    Object v14 = "";
    Object v15 = ((com.google.javascript.rhino.jstype.JSType)v13).findPropertyType(((java.lang.String)v14));
    Object v16 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v13));
    Object v17 = "c";
    Object v18 = false;
    Object v19 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v23 = ((java.lang.Enum)v22).getDeclaringClass();
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v22));
    Object v25 = "FUNCTION";
    Object v26 = false;
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = "f";
    Object v29 = true;
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v27),((java.lang.String)v28),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v24 = ((java.lang.Enum)v23).getDeclaringClass();
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v23));
    Object v26 = "j";
    Object v27 = false;
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v24 = ((java.lang.Enum)v23).getDeclaringClass();
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v23));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v25));
    Object v27 = "";
    Object v28 = false;
    Object v29 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v26),((java.lang.String)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v18 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v18));
    Object v20 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v17),((com.google.javascript.rhino.jstype.JSTypeRegistry)v19));
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v30 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v30));
    Object v32 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v29),((com.google.javascript.rhino.jstype.JSTypeRegistry)v31));
    Object v33 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v33));
    Object v35 = true;
    Object v36 = ((com.google.javascript.rhino.jstype.JSType)v34).getRestrictedTypeGivenToBooleanOutcome((((java.lang.Boolean)v35).booleanValue()));
    Object v37 = ")";
    Object v38 = false;
    Object v39 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v34),((java.lang.String)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = com.google.javascript.rhino.IR.nullNode();
    Object v16 = null;
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getTypeIfRefinable(((com.google.javascript.rhino.Node)v15),((com.google.javascript.jscomp.type.FlowScope)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v29 = ((java.lang.Enum)v28).getDeclaringClass();
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v28));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v23).getTypesUnderShallowInequality(((com.google.javascript.rhino.jstype.JSType)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v23));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v32));
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v33));
    Object v35 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getFirst();
    Object v19 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_TYPE;
    Object v15 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).getFirst();
    Object v30 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN;
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v29).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v30));
    Object v32 = ((com.google.javascript.rhino.jstype.JSType)v31).toDebugHashCodeString();
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v31));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v13));
    Object v15 = "%s aat %s line %s %s";
    Object v16 = false;
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getFirst();
    Object v16 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v16),((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v21 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v19).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v20));
    Object v22 = "return";
    Object v23 = true;
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v26));
    Object v28 = "";
    Object v29 = ((com.google.javascript.rhino.jstype.JSType)v27).findPropertyType(((java.lang.String)v28));
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v27));
    Object v31 = "c";
    Object v32 = false;
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v30),((java.lang.String)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = ((com.google.javascript.rhino.jstype.JSType)v33).toDebugHashCodeString();
    Object v35 = "m";
    Object v36 = false;
    Object v37 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v33),((java.lang.String)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v12),((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v16));
    Object v18 = "";
    Object v19 = ((com.google.javascript.rhino.jstype.JSType)v17).findPropertyType(((java.lang.String)v18));
    Object v20 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v17));
    Object v21 = "c";
    Object v22 = false;
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v20),((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v27));
    Object v29 = "%s aat %s line %s %s";
    Object v30 = false;
    Object v31 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v28),((java.lang.String)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v23));
    Object v25 = "";
    Object v26 = ((com.google.javascript.rhino.jstype.JSType)v24).findPropertyType(((java.lang.String)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v24));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).getFirst();
    Object v29 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN;
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v30).isNullable();
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v30));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v16 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v16));
    Object v18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v15),((com.google.javascript.rhino.jstype.JSTypeRegistry)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22));
    Object v24 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v25 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v25));
    Object v27 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v24),((com.google.javascript.rhino.jstype.JSTypeRegistry)v26));
    Object v28 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27));
    Object v29 = com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_TYPE;
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v29));
    Object v31 = ((com.google.javascript.rhino.jstype.JSType)v30).isGlobalThisType();
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v30));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getFirst();
    Object v15 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v14).getFirst();
    Object v16 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v16),((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v21 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v21));
    Object v23 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v20),((com.google.javascript.rhino.jstype.JSTypeRegistry)v22));
    Object v24 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v19).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v23));
    Object v25 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v26 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v26));
    Object v28 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v25),((com.google.javascript.rhino.jstype.JSTypeRegistry)v27));
    Object v29 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v24).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v28));
    Object v30 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v29).getFirst();
    Object v31 = com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN;
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v30).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12));
    Object v14 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v15 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v15));
    Object v17 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v14),((com.google.javascript.rhino.jstype.JSTypeRegistry)v16));
    Object v18 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v19 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v19));
    Object v21 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v18),((com.google.javascript.rhino.jstype.JSTypeRegistry)v20));
    Object v22 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v23 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v23));
    Object v25 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v22),((com.google.javascript.rhino.jstype.JSTypeRegistry)v24));
    Object v26 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25));
    Object v27 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v28 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v28));
    Object v30 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v27),((com.google.javascript.rhino.jstype.JSTypeRegistry)v29));
    Object v31 = com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE;
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v30).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v21).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v32));
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v33));
    Object v35 = "R";
    Object v36 = false;
    Object v37 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v13).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v34),((java.lang.String)v35),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v9 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v9));
    Object v11 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v8),((com.google.javascript.rhino.jstype.JSTypeRegistry)v10));
    Object v12 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v13 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v13));
    Object v15 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v12),((com.google.javascript.rhino.jstype.JSTypeRegistry)v14));
    Object v16 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v17 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v17));
    Object v19 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v16),((com.google.javascript.rhino.jstype.JSTypeRegistry)v18));
    Object v20 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v15).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v19));
    Object v21 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v22 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v22));
    Object v24 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v21),((com.google.javascript.rhino.jstype.JSTypeRegistry)v23));
    Object v25 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v20).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v24));
    Object v26 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v27 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v27));
    Object v29 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v26),((com.google.javascript.rhino.jstype.JSTypeRegistry)v28));
    Object v30 = com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE;
    Object v31 = ((java.lang.Enum)v30).getDeclaringClass();
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v29).getNativeType(((com.google.javascript.rhino.jstype.JSTypeNative)v30));
    Object v33 = "FUNCTION";
    Object v34 = false;
    Object v35 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v25).getRestrictedByTypeOfResult(((com.google.javascript.rhino.jstype.JSType)v32),((java.lang.String)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v11).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v35));
    Object v37 = ((com.google.javascript.rhino.jstype.JSType)v36).getPossibleToBooleanOutcomes();
    Object v38 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7).getRestrictedWithoutUndefined(((com.google.javascript.rhino.jstype.JSType)v36));
    Object v39 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).getRestrictedWithoutNull(((com.google.javascript.rhino.jstype.JSType)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v1 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v1));
    Object v3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v0),((com.google.javascript.rhino.jstype.JSTypeRegistry)v2));
    Object v4 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v5 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v5));
    Object v7 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v4),((com.google.javascript.rhino.jstype.JSTypeRegistry)v6));
    Object v8 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v3).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v7));
    Object v9 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v10 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v10));
    Object v12 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v9),((com.google.javascript.rhino.jstype.JSTypeRegistry)v11));
    Object v13 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v14 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v14));
    Object v16 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v13),((com.google.javascript.rhino.jstype.JSTypeRegistry)v15));
    Object v17 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v12).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v16));
    Object v18 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v8).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v17));
    Object v19 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v20 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v20));
    Object v22 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v19),((com.google.javascript.rhino.jstype.JSTypeRegistry)v21));
    Object v23 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v24 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v24));
    Object v26 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v23),((com.google.javascript.rhino.jstype.JSTypeRegistry)v25));
    Object v27 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v22).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v26));
    Object v28 = new com.google.javascript.jscomp.JqueryCodingConvention();
    Object v29 = new com.google.javascript.rhino.SimpleErrorReporter();
    Object v30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(((com.google.javascript.rhino.ErrorReporter)v29));
    Object v31 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter(((com.google.javascript.jscomp.CodingConvention)v28),((com.google.javascript.rhino.jstype.JSTypeRegistry)v30));
    Object v32 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v27).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v31));
    Object v33 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v32).getFirst();
    Object v34 = ((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v18).append(((com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
