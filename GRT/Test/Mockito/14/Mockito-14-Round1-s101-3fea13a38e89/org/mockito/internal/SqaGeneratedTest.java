package org.mockito.internal;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.MockitoCore();
    Object v2 = 0;
    Object v3 = new org.mockito.internal.verification.Times((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v1),((org.mockito.verification.VerificationMode)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = ((org.mockito.internal.MockitoCore)v0).stub();
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 0;
    Object v2 = new org.mockito.internal.verification.Times((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = ((org.mockito.internal.MockitoCore)v0).getLastInvocation();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    Object v2 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = 0;
    Object v3 = new org.mockito.internal.verification.Times((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v1),((org.mockito.verification.VerificationMode)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 0;
    Object v2 = new org.mockito.internal.verification.Times((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.mockito.internal.verification.Times((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v2),((org.mockito.verification.VerificationMode)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.List)v1).size();
    Object v3 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = java.util.List.of();
    Object v4 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v3),((org.mockito.internal.verification.api.InOrderContext)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = ((org.mockito.internal.MockitoCore)v0).getLastInvocation();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = java.util.List.of();
    Object v3 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = 0;
    Object v3 = new org.mockito.internal.verification.Times((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v1),((org.mockito.verification.VerificationMode)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = ((org.mockito.internal.MockitoCore)v0).stub();
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new org.mockito.internal.verification.InOrderContextImpl();
    Object v5 = 0;
    Object v6 = new org.mockito.internal.verification.Times((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v4),((org.mockito.verification.VerificationMode)v6));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = ((java.util.Collection)v1).parallelStream();
    Object v3 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stub();
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.verification.InOrderContextImpl();
    Object v2 = 0;
    Object v3 = new org.mockito.internal.verification.Times((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v1),((org.mockito.verification.VerificationMode)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = ((org.mockito.internal.MockitoCore)v0).getLastInvocation();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = 0;
    Object v4 = new org.mockito.internal.verification.Times((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    Object v3 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{null};
    Object v3 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = java.util.List.of();
    Object v5 = ((java.util.Collection)v4).parallelStream();
    Object v6 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v4),((org.mockito.internal.verification.api.InOrderContext)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{};
    Object v5 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = new org.mockito.internal.verification.Times((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new org.mockito.internal.verification.Times((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v5),((org.mockito.verification.VerificationMode)v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 0;
    Object v2 = new org.mockito.internal.verification.Times((((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.function.Predicate.isEqual(((java.lang.Object)v2));
    Object v4 = 0;
    Object v5 = new org.mockito.internal.verification.Times((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v3),((org.mockito.verification.VerificationMode)v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = 0;
    Object v3 = new org.mockito.internal.verification.Times((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v1),((org.mockito.verification.VerificationMode)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{null};
    Object v5 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    Object v3 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = java.util.List.of();
    Object v5 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{null,null,null};
    Object v3 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = java.util.List.of();
    Object v4 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = java.util.List.of();
    Object v5 = 0;
    Object v6 = new org.mockito.internal.verification.Times((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v4),((org.mockito.verification.VerificationMode)v6));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v3 = 0;
    Object v4 = new org.mockito.internal.verification.Times((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v2),((org.mockito.verification.VerificationMode)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = 0;
    Object v7 = new org.mockito.internal.verification.Times((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v5),((org.mockito.verification.VerificationMode)v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = null;
    Object v2 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v1));
    Object v3 = 0;
    Object v4 = new org.mockito.internal.verification.Times((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v2),((org.mockito.verification.VerificationMode)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{};
    Object v3 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = 0;
    Object v3 = new org.mockito.internal.verification.Times((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v1),((org.mockito.verification.VerificationMode)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v2));
    Object v4 = 0;
    Object v5 = new org.mockito.internal.verification.Times((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v3),((org.mockito.verification.VerificationMode)v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    Object v3 = ((org.mockito.internal.MockitoCore)v0).stub();
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.verification.InOrderContextImpl();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = java.util.List.of();
    Object v3 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 0;
    Object v2 = new org.mockito.internal.verification.Times((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 0;
    Object v2 = new org.mockito.internal.verification.Times((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = java.util.List.of();
    Object v5 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v4),((org.mockito.internal.verification.api.InOrderContext)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.util.List.of();
    Object v2 = new org.mockito.internal.verification.InOrderContextImpl();
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractionsInOrder(((java.util.List)v1),((org.mockito.internal.verification.api.InOrderContext)v2));
    Object v3 = null;
    Object v4 = null;
    Object v5 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v4));
    Object v6 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }
}
