package org.mockito.exceptions;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).extraInterfacesRequiresAtLeastOneInterface();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).cannotCallRealMethodOnInterface();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).inOrderRequiresFamiliarMock();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).missingMethodInvocation();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = new java.lang.Exception();
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForInjectMocksAnnotation(((java.lang.String)v1),((java.lang.Exception)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).nullPassedToVerify();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v1));
    Object v3 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.Object)v2),((org.mockito.internal.debugging.Location)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "Ex";
    Object v2 = "|";
    Object v3 = "No matchers found for] And(?).";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new java.lang.Exception();
    Object v2 = 21;
    Object v3 = new java.io.StringWriter((((java.lang.Integer)v2).intValue()));
    Object v4 = new java.io.PrintWriter(((java.io.Writer)v3));
    ((java.lang.Throwable)v1).printStackTrace(((java.io.PrintWriter)v4));
    Object v5 = null;
    ((org.mockito.exceptions.Reporter)v0).checkedExceptionInvalid(((java.lang.Throwable)v1));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).noArgumentValueWasCaptured();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).onlyVoidMethodsCanBeSetToDoNothing();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 43;
    Object v2 = 0;
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = null;
    Object v7 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v6));
    Object v8 = new java.lang.Exception();
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v3),((java.util.List)v9));
    Object v11 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocationsInOrder((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.exceptions.PrintableInvocation)v10),((org.mockito.internal.debugging.Location)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).notAMockPassedWhenCreatingInOrder();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).cannotVerifyToString();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = null;
    Object v10 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v9));
    Object v11 = null;
    Object v12 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v11));
    Object v13 = new java.lang.Exception();
    Object v14 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v13));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvoked(((org.mockito.exceptions.PrintableInvocation)v8),((java.util.List)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).notAMockPassedToWhenMethod();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).extraInterfacesDoesNotAcceptNullParameters();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = new org.mockito.exceptions.Discrepancy((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = null;
    Object v6 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v5));
    Object v7 = null;
    Object v8 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v7));
    Object v9 = new java.lang.Exception();
    Object v10 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v4),((java.util.List)v10));
    Object v12 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooLittleActualInvocationsInOrder(((org.mockito.exceptions.Discrepancy)v3),((org.mockito.exceptions.PrintableInvocation)v11),((org.mockito.internal.debugging.Location)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = null;
    Object v10 = null;
    Object v11 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v10));
    Object v12 = null;
    Object v13 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v12));
    Object v14 = new java.lang.Exception();
    Object v15 = java.util.List.of(((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v9),((java.util.List)v15));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvokedInOrder(((org.mockito.exceptions.PrintableInvocation)v8),((org.mockito.exceptions.PrintableInvocation)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).neverWantedButInvoked(((org.mockito.exceptions.PrintableInvocation)v8),((org.mockito.internal.debugging.Location)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = new java.lang.Exception();
    Object v10 = new org.mockito.internal.stubbing.answers.ThrowsException(((java.lang.Throwable)v9));
    Object v11 = new org.mockito.internal.stubbing.StubbedInvocationMatcher(((org.mockito.internal.invocation.InvocationMatcher)v8),((org.mockito.stubbing.Answer)v10));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvoked(((org.mockito.exceptions.PrintableInvocation)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new org.mockito.internal.debugging.Location();
    Object v2 = ((org.mockito.internal.debugging.Location)v1).toString();
    ((org.mockito.exceptions.Reporter)v0).misplacedArgumentMatcher(((org.mockito.internal.debugging.Location)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "Unable to set MockitoNamingPolicy on cglib generator which creates FastClasses";
    Object v2 = ")";
    Object v3 = ", ";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 43;
    Object v2 = 0;
    ((org.mockito.exceptions.Reporter)v0).invalidUseOfMatchers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.mockito.exceptions.Reporter();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "\n";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).cannotStubWithNullThrowable();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = new org.mockito.exceptions.Discrepancy((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = null;
    Object v6 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v5));
    Object v7 = null;
    Object v8 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v7));
    Object v9 = new java.lang.Exception();
    Object v10 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v4),((java.util.List)v10));
    Object v12 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooLittleActualInvocations(((org.mockito.exceptions.Discrepancy)v3),((org.mockito.exceptions.PrintableInvocation)v11),((org.mockito.internal.debugging.Location)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "Invalid:";
    Object v2 = new java.lang.Exception();
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForSpyAnnotation(((java.lang.String)v1),((java.lang.Exception)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).notAMockPassedToVerifyNoMoreInteractions();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "T";
    Object v2 = "C";
    Object v3 = "}";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).mocksHaveToBePassedWhenCreatingInOrder();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = new java.lang.Exception();
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForSpyAnnotation(((java.lang.String)v1),((java.lang.Exception)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).nullPassedWhenCreatingInOrder();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).mocksHaveToBePassedToVerifyNoMoreInteractions();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new java.lang.Exception();
    Object v2 = new org.mockito.internal.stubbing.answers.ThrowsException(((java.lang.Throwable)v1));
    Object v3 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.Object)v2),((org.mockito.internal.debugging.Location)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.Object)v1),((org.mockito.internal.debugging.Location)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = null;
    Object v10 = null;
    Object v11 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v10));
    Object v12 = null;
    Object v13 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v12));
    Object v14 = new java.lang.Exception();
    Object v15 = java.util.List.of(((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v9),((java.util.List)v15));
    Object v17 = new java.lang.Exception();
    Object v18 = new org.mockito.internal.stubbing.answers.ThrowsException(((java.lang.Throwable)v17));
    Object v19 = new org.mockito.internal.stubbing.StubbedInvocationMatcher(((org.mockito.internal.invocation.InvocationMatcher)v16),((org.mockito.stubbing.Answer)v18));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvokedInOrder(((org.mockito.exceptions.PrintableInvocation)v8),((org.mockito.exceptions.PrintableInvocation)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new org.mockito.internal.debugging.Location();
    Object v2 = ((org.mockito.internal.debugging.Location)v1).toString();
    ((org.mockito.exceptions.Reporter)v0).unfinishedStubbing(((org.mockito.internal.debugging.Location)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).unfinishedVerificationException(((org.mockito.internal.debugging.Location)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedVerificationException");
    } catch (org.mockito.exceptions.misusing.UnfinishedVerificationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 56;
    Object v2 = 36;
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = null;
    Object v7 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v6));
    Object v8 = new java.lang.Exception();
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v3),((java.util.List)v9));
    Object v11 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocations((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.exceptions.PrintableInvocation)v10),((org.mockito.internal.debugging.Location)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "Cannot call real method on java interface. Interface does not have any1 implementation!";
    Object v2 = "";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 21;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.mockito.internal.debugging.Location();
    Object v4 = ((org.mockito.internal.debugging.Location)v3).toString();
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.Object)v2),((org.mockito.internal.debugging.Location)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    ((org.mockito.exceptions.Reporter)v0).cannotStubVoidMethodWithAReturnValue(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "\")";
    ((org.mockito.exceptions.Reporter)v0).cannotStubVoidMethodWithAReturnValue(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = " cannot be returned by ";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).unfinishedStubbing(((org.mockito.internal.debugging.Location)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 1;
    Object v2 = 0;
    ((org.mockito.exceptions.Reporter)v0).invalidUseOfMatchers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).nullPassedToWhenMethod();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = new java.lang.Exception();
    Object v10 = new org.mockito.internal.stubbing.answers.ThrowsException(((java.lang.Throwable)v9));
    Object v11 = new org.mockito.internal.stubbing.StubbedInvocationMatcher(((org.mockito.internal.invocation.InvocationMatcher)v8),((org.mockito.stubbing.Answer)v10));
    Object v12 = null;
    Object v13 = null;
    Object v14 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v13));
    Object v15 = null;
    Object v16 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v15));
    Object v17 = new java.lang.Exception();
    Object v18 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v12),((java.util.List)v18));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvokedInOrder(((org.mockito.exceptions.PrintableInvocation)v11),((org.mockito.exceptions.PrintableInvocation)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvoked(((org.mockito.exceptions.PrintableInvocation)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 0;
    Object v2 = 0;
    ((org.mockito.exceptions.Reporter)v0).invalidUseOfMatchers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = new org.mockito.exceptions.Discrepancy((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.Object)v3),((org.mockito.internal.debugging.Location)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).nullPassedToVerifyNoMoreInteractions();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = null;
    Object v10 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v9));
    Object v11 = null;
    Object v12 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v11));
    Object v13 = new java.lang.Exception();
    Object v14 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = ((java.util.List)v14).hashCode();
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvoked(((org.mockito.exceptions.PrintableInvocation)v8),((java.util.List)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "T";
    Object v2 = "";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = "F";
    Object v3 = "or(";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = new java.lang.Exception();
    Object v10 = new org.mockito.internal.stubbing.answers.ThrowsException(((java.lang.Throwable)v9));
    Object v11 = new org.mockito.internal.stubbing.StubbedInvocationMatcher(((org.mockito.internal.invocation.InvocationMatcher)v8),((org.mockito.stubbing.Answer)v10));
    Object v12 = null;
    Object v13 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v12));
    Object v14 = null;
    Object v15 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v14));
    Object v16 = new java.lang.Exception();
    Object v17 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v15),((java.lang.Object)v16));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvoked(((org.mockito.exceptions.PrintableInvocation)v11),((java.util.List)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new java.lang.Exception();
    ((org.mockito.exceptions.Reporter)v0).checkedExceptionInvalid(((java.lang.Throwable)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.DelegatingMethod(((java.lang.reflect.Method)v2));
    ((org.mockito.exceptions.Reporter)v0).mockedTypeIsInconsistentWithSpiedInstanceType(((java.lang.Class)v1),((java.lang.Object)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = "";
    Object v3 = "    verify(mock, times(10)).someMethod()`";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 14;
    Object v2 = 0;
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = null;
    Object v7 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v6));
    Object v8 = new java.lang.Exception();
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v3),((java.util.List)v9));
    Object v11 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocationsInOrder((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.exceptions.PrintableInvocation)v10),((org.mockito.internal.debugging.Location)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 46;
    Object v2 = -27;
    ((org.mockito.exceptions.Reporter)v0).invalidUseOfMatchers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ".";
    Object v2 = "Problemsm injecting dependencies in ";
    Object v3 = "";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = -8;
    Object v2 = 1;
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = null;
    Object v7 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v6));
    Object v8 = new java.lang.Exception();
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v3),((java.util.List)v9));
    Object v11 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocationsInOrder((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.exceptions.PrintableInvocation)v10),((org.mockito.internal.debugging.Location)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = null;
    Object v7 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v6));
    Object v8 = new java.lang.Exception();
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v3),((java.util.List)v9));
    Object v11 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocations((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.exceptions.PrintableInvocation)v10),((org.mockito.internal.debugging.Location)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = null;
    Object v7 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v6));
    Object v8 = new java.lang.Exception();
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v3),((java.util.List)v9));
    Object v11 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocations((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.exceptions.PrintableInvocation)v10),((org.mockito.internal.debugging.Location)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = new java.lang.Exception();
    Object v10 = new org.mockito.internal.stubbing.answers.ThrowsException(((java.lang.Throwable)v9));
    Object v11 = new org.mockito.internal.stubbing.StubbedInvocationMatcher(((org.mockito.internal.invocation.InvocationMatcher)v8),((org.mockito.stubbing.Answer)v10));
    Object v12 = null;
    Object v13 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v12));
    Object v14 = null;
    Object v15 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v14));
    Object v16 = new java.lang.Exception();
    Object v17 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = null;
    Object v19 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v18));
    Object v20 = null;
    Object v21 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v20));
    Object v22 = new java.lang.Exception();
    Object v23 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = ((java.util.List)v17).containsAll(((java.util.Collection)v23));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvoked(((org.mockito.exceptions.PrintableInvocation)v11),((java.util.List)v17));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ",2 ";
    Object v2 = new java.lang.Exception();
    Object v3 = 21;
    Object v4 = new java.io.StringWriter((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.io.PrintWriter(((java.io.Writer)v4));
    ((java.lang.Throwable)v2).printStackTrace(((java.io.PrintWriter)v5));
    Object v6 = null;
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForSpyAnnotation(((java.lang.String)v1),((java.lang.Exception)v2));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = null;
    Object v10 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v9));
    Object v11 = null;
    Object v12 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v11));
    Object v13 = new java.lang.Exception();
    Object v14 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = null;
    Object v16 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v15));
    Object v17 = ((java.util.List)v14).contains(((java.lang.Object)v16));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvoked(((org.mockito.exceptions.PrintableInvocation)v8),((java.util.List)v14));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = ")";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = "";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "\")S";
    Object v2 = new java.lang.Exception();
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForInjectMocksAnnotation(((java.lang.String)v1),((java.lang.Exception)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "' but this field is not declared withing hierar";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new java.lang.Exception();
    ((java.lang.Throwable)v1).printStackTrace();
    Object v2 = null;
    ((org.mockito.exceptions.Reporter)v0).checkedExceptionInvalid(((java.lang.Throwable)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "' field.";
    Object v2 = "";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 60;
    Object v2 = 0;
    ((org.mockito.exceptions.Reporter)v0).invalidUseOfMatchers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "\")";
    Object v2 = "V";
    Object v3 = "Actually, there were zero interactions with this mock.\n";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = -32;
    Object v2 = 11;
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = null;
    Object v7 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v6));
    Object v8 = new java.lang.Exception();
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v3),((java.util.List)v9));
    Object v11 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocations((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.exceptions.PrintableInvocation)v10),((org.mockito.internal.debugging.Location)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).misplacedArgumentMatcher(((org.mockito.internal.debugging.Location)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 0;
    Object v2 = 43;
    ((org.mockito.exceptions.Reporter)v0).invalidUseOfMatchers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = null;
    Object v10 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v9));
    Object v11 = null;
    Object v12 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v11));
    Object v13 = new java.lang.Exception();
    Object v14 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = 0;
    Object v16 = ((java.util.List)v14).listIterator((((java.lang.Integer)v15).intValue()));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvoked(((org.mockito.exceptions.PrintableInvocation)v8),((java.util.List)v14));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = new org.mockito.exceptions.Discrepancy((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = null;
    Object v6 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v5));
    Object v7 = null;
    Object v8 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v7));
    Object v9 = new java.lang.Exception();
    Object v10 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v4),((java.util.List)v10));
    Object v12 = new org.mockito.internal.debugging.Location();
    Object v13 = ((org.mockito.internal.debugging.Location)v12).toString();
    ((org.mockito.exceptions.Reporter)v0).tooLittleActualInvocationsInOrder(((org.mockito.exceptions.Discrepancy)v3),((org.mockito.exceptions.PrintableInvocation)v11),((org.mockito.internal.debugging.Location)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "+";
    Object v2 = new java.lang.Exception();
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForInjectMocksAnnotation(((java.lang.String)v1),((java.lang.Exception)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "the ty\"e '";
    ((org.mockito.exceptions.Reporter)v0).cannotStubVoidMethodWithAReturnValue(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ")";
    Object v2 = " matchers expeced, ";
    Object v3 = "";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    ((org.mockito.exceptions.Reporter)v0).notAMockPassedToVerify(((java.lang.Class)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = null;
    Object v10 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v9));
    Object v11 = null;
    Object v12 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v11));
    Object v13 = new java.lang.Exception();
    Object v14 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = 21;
    Object v16 = new java.io.StringWriter((((java.lang.Integer)v15).intValue()));
    Object v17 = new java.io.PrintWriter(((java.io.Writer)v16));
    Object v18 = ((java.util.List)v14).lastIndexOf(((java.lang.Object)v17));
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvoked(((org.mockito.exceptions.PrintableInvocation)v8),((java.util.List)v14));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = -14;
    Object v2 = 34;
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = null;
    Object v7 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v6));
    Object v8 = new java.lang.Exception();
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v3),((java.util.List)v9));
    Object v11 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocations((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.exceptions.PrintableInvocation)v10),((org.mockito.internal.debugging.Location)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "   @Spy List mock = new LinkedList();";
    Object v2 = "InOrder can only verify mocks that were passed in during creation of InOrder.";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "\\\\";
    Object v2 = "Argument should be a mock, but is:";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "***EMockito interactions log ***";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "noI(";
    Object v2 = "";
    Object v3 = "Y";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "{\n";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 24;
    Object v2 = 1;
    ((org.mockito.exceptions.Reporter)v0).invalidUseOfMatchers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "%";
    ((org.mockito.exceptions.Reporter)v0).cannotStubVoidMethodWithAReturnValue(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = "y";
    Object v3 = "";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 70;
    Object v2 = -33;
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = null;
    Object v7 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v6));
    Object v8 = new java.lang.Exception();
    Object v9 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v3),((java.util.List)v9));
    Object v11 = new org.mockito.internal.debugging.Location();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocationsInOrder((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.exceptions.PrintableInvocation)v10),((org.mockito.internal.debugging.Location)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = new java.lang.Exception();
    Object v7 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v7));
    Object v9 = null;
    Object v10 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v9));
    Object v11 = null;
    Object v12 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v11));
    Object v13 = new java.lang.Exception();
    Object v14 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = ((java.util.List)v14).iterator();
    ((org.mockito.exceptions.Reporter)v0).wantedButNotInvoked(((org.mockito.exceptions.PrintableInvocation)v8),((java.util.List)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
