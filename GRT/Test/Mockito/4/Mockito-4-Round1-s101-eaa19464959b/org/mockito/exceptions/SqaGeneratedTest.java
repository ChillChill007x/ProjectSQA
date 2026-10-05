package org.mockito.exceptions;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).stubPassedToVerify();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock");
    } catch (org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).inOrderRequiresFamiliarMock();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).defaultAnswerDoesNotAcceptNullParameter();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = "";
    Object v3 = "Prblems reading from: ";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).mocksHaveToBePassedWhenCreatingInOrder();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "return type should be";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForSpyAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).incorrectUseOfApi();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).spyAndDelegateAreMutuallyExclusive();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).atMostAndNeverShouldNotBeUsedWithTimeout();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.FriendlyReminderException");
    } catch (org.mockito.exceptions.misusing.FriendlyReminderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).cannotCallAbstractRealMethod();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = org.mockito.Matchers.anyList();
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new java.util.TreeSet(((java.util.Comparator)v2));
    Object v4 = ((java.util.List)v1).addAll(((java.util.Collection)v3));
    ((org.mockito.exceptions.Reporter)v0).misplacedArgumentMatcher(((java.util.List)v1));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).cannotStubWithNullThrowable();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ")";
    Object v2 = "0";
    Object v3 = "Invalid argument index for the current invocation of method : ";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "'";
    Object v2 = "";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v1));
    ((org.mockito.exceptions.Reporter)v0).checkedExceptionInvalid(((java.lang.Throwable)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ")";
    Object v2 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v3 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v2));
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.String)v1),((org.mockito.invocation.Location)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = org.mockito.Matchers.anyList();
    ((org.mockito.exceptions.Reporter)v0).misplacedArgumentMatcher(((java.util.List)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).notAMockPassedWhenCreatingInOrder();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = org.mockito.mock.SerializableMode.ACROSS_CLASSLOADERS;
    ((org.mockito.exceptions.Reporter)v0).usingConstructorWithFancySerializable(((org.mockito.mock.SerializableMode)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "H";
    Object v2 = 1;
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new java.util.TreeSet(((java.util.Comparator)v3));
    ((org.mockito.exceptions.Reporter)v0).incorrectUseOfAdditionalMatchers(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),((java.util.Collection)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 1;
    Object v2 = org.mockito.Matchers.anyList();
    Object v3 = null;
    Object v4 = new org.mockito.internal.creation.DelegatingMethod(((java.lang.reflect.Method)v3));
    Object v5 = ((java.util.List)v2).remove(((java.lang.Object)v4));
    ((org.mockito.exceptions.Reporter)v0).invalidUseOfMatchers((((java.lang.Integer)v1).intValue()),((java.util.List)v2));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).notAMockPassedToWhenMethod();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v2 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v1));
    ((org.mockito.exceptions.Reporter)v0).unfinishedStubbing(((org.mockito.invocation.Location)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "Incorrect us of API detected here:";
    ((org.mockito.exceptions.Reporter)v0).cannotStubVoidMethodWithAReturnValue(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue");
    } catch (org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).noArgumentValueWasCaptured();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).invocationListenersRequiresAtLeastOneListener();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).extraInterfacesRequiresAtLeastOneInterface();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = org.mockito.mock.SerializableMode.BASIC;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    ((org.mockito.exceptions.Reporter)v0).usingConstructorWithFancySerializable(((org.mockito.mock.SerializableMode)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForInjectMocksAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = -33;
    Object v2 = 25;
    Object v3 = null;
    Object v4 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v5 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v4));
    Object v6 = ((org.mockito.invocation.Location)v5).toString();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocationsInOrder((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.invocation.DescribedInvocation)v3),((org.mockito.invocation.Location)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "s";
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.lang.String)v1),((java.nio.charset.Charset)v2));
    Object v4 = new org.mockito.internal.debugging.VerboseMockInvocationLogger(((java.io.PrintStream)v3));
    Object v5 = "";
    Object v6 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v6).getSuppressed();
    ((org.mockito.exceptions.Reporter)v0).invocationListenerThrewException(((org.mockito.listeners.InvocationListener)v4),((java.lang.Throwable)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    ((org.mockito.exceptions.Reporter)v0).reportNoSubMatchersFound(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).notAMockPassedToVerifyNoMoreInteractions();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
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
    Object v1 = "Y";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    Object v4 = "type";
    Object v5 = new java.io.PrintWriter(((java.lang.String)v4));
    ((java.lang.Throwable)v3).printStackTrace(((java.io.PrintWriter)v5));
    Object v6 = null;
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForInjectMocksAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).onlyVoidMethodsCanBeSetToDoNothing();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "RETURNSMOCKS";
    Object v2 = 0;
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new java.util.TreeSet(((java.util.Comparator)v3));
    ((org.mockito.exceptions.Reporter)v0).incorrectUseOfAdditionalMatchers(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),((java.util.Collection)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = "\"";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = org.mockito.mock.SerializableMode.NONE;
    ((org.mockito.exceptions.Reporter)v0).usingConstructorWithFancySerializable(((org.mockito.mock.SerializableMode)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).nullPassedToVerifyNoMoreInteractions();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ")";
    Object v2 = 1;
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new java.util.TreeSet(((java.util.Comparator)v3));
    Object v5 = ((java.util.Collection)v4).toArray();
    ((org.mockito.exceptions.Reporter)v0).incorrectUseOfAdditionalMatchers(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),((java.util.Collection)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).invocationListenerDoesNotAcceptNullParameters();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "s";
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.lang.String)v1),((java.nio.charset.Charset)v2));
    Object v4 = new org.mockito.internal.debugging.VerboseMockInvocationLogger(((java.io.PrintStream)v3));
    Object v5 = "";
    Object v6 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v5));
    ((org.mockito.exceptions.Reporter)v0).invocationListenerThrewException(((org.mockito.listeners.InvocationListener)v4),((java.lang.Throwable)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v2 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v1));
    ((org.mockito.exceptions.Reporter)v0).unfinishedVerificationException(((org.mockito.invocation.Location)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedVerificationException");
    } catch (org.mockito.exceptions.misusing.UnfinishedVerificationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).invalidArgumentRangeAtIdentityAnswerCreationTime();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).nullPassedToWhenMethod();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).mocksHaveToBePassedToVerifyNoMoreInteractions();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = 1;
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new java.util.TreeSet(((java.util.Comparator)v3));
    ((org.mockito.exceptions.Reporter)v0).incorrectUseOfAdditionalMatchers(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),((java.util.Collection)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).cannotVerifyToString();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 0;
    Object v2 = org.mockito.Matchers.anyList();
    ((org.mockito.exceptions.Reporter)v0).invalidUseOfMatchers((((java.lang.Integer)v1).intValue()),((java.util.List)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).extraInterfacesDoesNotAcceptNullParameters();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "this is definitely a bug in our code as it mean` the JDK team changed a few internal things.";
    ((org.mockito.exceptions.Reporter)v0).reportNoSubMatchersFound(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "CALLS_REAL_METHODS";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).nullPassedToVerify();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ", but Cas: ";
    Object v2 = 0;
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new java.util.TreeSet(((java.util.Comparator)v3));
    ((org.mockito.exceptions.Reporter)v0).incorrectUseOfAdditionalMatchers(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),((java.util.Collection)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = "'.";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "Mockito mockcannot be deserialized to a mock of '";
    ((org.mockito.exceptions.Reporter)v0).cannotStubVoidMethodWithAReturnValue(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue");
    } catch (org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v3 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v2));
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.String)v1),((org.mockito.invocation.Location)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    ((org.mockito.exceptions.Reporter)v0).extraInterfacesCannotContainMockedType(((java.lang.Class)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.mockito.exceptions.Reporter();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    ((org.mockito.exceptions.Reporter)v0).missingMethodInvocation();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "Invalid: ";
    ((org.mockito.exceptions.Reporter)v0).cannotStubVoidMethodWithAReturnValue(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue");
    } catch (org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "o";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForInjectMocksAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "    doThrow(exception).wyen(mock).someVoidMethod();";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForInjectMocksAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 1;
    Object v2 = org.mockito.Matchers.anyList();
    ((org.mockito.exceptions.Reporter)v0).invalidUseOfMatchers((((java.lang.Integer)v1).intValue()),((java.util.List)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "d";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForSpyAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = 0;
    Object v2 = -31;
    Object v3 = null;
    Object v4 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v5 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v4));
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocationsInOrder((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.invocation.DescribedInvocation)v3),((org.mockito.invocation.Location)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "|";
    ((org.mockito.exceptions.Reporter)v0).cannotStubVoidMethodWithAReturnValue(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue");
    } catch (org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    ((org.mockito.exceptions.Reporter)v0).extraInterfacesAcceptsOnlyInterfaces(((java.lang.Class)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ", hashCgde: ";
    Object v2 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v3 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v2));
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.String)v1),((org.mockito.invocation.Location)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "'.";
    Object v2 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v3 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v2));
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.String)v1),((org.mockito.invocation.Location)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "    verify(mo";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).fillInStackTrace();
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForInjectMocksAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "M";
    ((org.mockito.exceptions.Reporter)v0).reportNoSubMatchersFound(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "    doThrow(new RuntimeExcept";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ")";
    ((org.mockito.exceptions.Reporter)v0).cannotStubVoidMethodWithAReturnValue(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue");
    } catch (org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "/";
    Object v2 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v3 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v2));
    Object v4 = ((org.mockito.invocation.Location)v3).toString();
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.String)v1),((org.mockito.invocation.Location)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "Problems initializing field '";
    Object v2 = "s";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "    verify(mock, times(10)).someMethod();";
    ((org.mockito.exceptions.Reporter)v0).reportNoSubMatchersFound(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "'";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForInjectMocksAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "Access not authorized o";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForInjectMocksAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = org.mockito.Matchers.anyList();
    Object v2 = 0;
    Object v3 = ((java.util.List)v1).listIterator((((java.lang.Integer)v2).intValue()));
    ((org.mockito.exceptions.Reporter)v0).misplacedArgumentMatcher(((java.util.List)v1));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "Cannot stub with null throwable!";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = false;
    Object v3 = 0;
    Object v4 = ((org.mockito.exceptions.Reporter)v0).invalidArgumentPositionRangeAtInvocationTime(((org.mockito.invocation.InvocationOnMock)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v2 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v1));
    Object v3 = ((org.mockito.invocation.Location)v2).toString();
    ((org.mockito.exceptions.Reporter)v0).unfinishedVerificationException(((org.mockito.invocation.Location)v2));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedVerificationException");
    } catch (org.mockito.exceptions.misusing.UnfinishedVerificationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "`)";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new java.util.TreeSet(((java.util.Comparator)v3));
    ((org.mockito.exceptions.Reporter)v0).incorrectUseOfAdditionalMatchers(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),((java.util.Collection)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "q";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForSpyAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "'";
    Object v2 = "*'";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ")";
    Object v2 = "Invalid use of argument matchers inside additional matcher ";
    Object v3 = "";
    ((org.mockito.exceptions.Reporter)v0).wrongTypeOfReturnValue(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.WrongTypeOfReturnValue");
    } catch (org.mockito.exceptions.misusing.WrongTypeOfReturnValue expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ")";
    Object v2 = 0;
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new java.util.TreeSet(((java.util.Comparator)v3));
    ((org.mockito.exceptions.Reporter)v0).incorrectUseOfAdditionalMatchers(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),((java.util.Collection)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "s";
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = new java.io.PrintStream(((java.lang.String)v1),((java.nio.charset.Charset)v2));
    Object v4 = new org.mockito.internal.debugging.VerboseMockInvocationLogger(((java.io.PrintStream)v3));
    Object v5 = "";
    Object v6 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v5));
    Object v7 = new java.lang.StackTraceElement[]{};
    ((java.lang.Throwable)v6).setStackTrace(((java.lang.StackTraceElement[])v7));
    Object v8 = null;
    ((org.mockito.exceptions.Reporter)v0).invocationListenerThrewException(((org.mockito.listeners.InvocationListener)v4),((java.lang.Throwable)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "g";
    ((org.mockito.exceptions.Reporter)v0).reportNoSubMatchersFound(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = null;
    Object v2 = false;
    Object v3 = -10;
    Object v4 = ((org.mockito.exceptions.Reporter)v0).invalidArgumentPositionRangeAtInvocationTime(((org.mockito.invocation.InvocationOnMock)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = -3;
    Object v2 = 1;
    Object v3 = null;
    Object v4 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v5 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v4));
    Object v6 = ((org.mockito.invocation.Location)v5).toString();
    ((org.mockito.exceptions.Reporter)v0).tooManyActualInvocationsInOrder((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.mockito.invocation.DescribedInvocation)v3),((org.mockito.invocation.Location)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "P";
    Object v2 = "K";
    ((org.mockito.exceptions.Reporter)v0).unsupportedCombinationOfAnnotations(((java.lang.String)v1),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ")";
    ((org.mockito.exceptions.Reporter)v0).moreThanOneAnnotationNotAllowed(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = ")";
    ((org.mockito.exceptions.Reporter)v0).reportNoSubMatchersFound(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "<";
    Object v2 = "";
    Object v3 = new org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue(((java.lang.String)v2));
    ((org.mockito.exceptions.Reporter)v0).cannotInitializeForSpyAnnotation(((java.lang.String)v1),((java.lang.Exception)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.mockito.exceptions.Reporter();
    Object v1 = "' with value: '";
    Object v2 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
    Object v3 = new org.mockito.internal.debugging.LocationImpl(((org.mockito.internal.exceptions.stacktrace.StackTraceFilter)v2));
    ((org.mockito.exceptions.Reporter)v0).smartNullPointerException(((java.lang.String)v1),((org.mockito.invocation.Location)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.verification.SmartNullPointerException");
    } catch (org.mockito.exceptions.verification.SmartNullPointerException expected) { }
  }
}
