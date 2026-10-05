package org.mockito.internal;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.MockitoCore();
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v1),((org.mockito.internal.verification.api.VerificationMode)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = ((org.mockito.internal.MockitoCore)v0).stub();
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = null;
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = false;
    Object v6 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v3),((org.mockito.MockSettings)v4),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null};
    Object v2 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v1),((org.mockito.internal.verification.api.VerificationMode)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = ((org.mockito.internal.MockitoCore)v0).getLastInvocation();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v2),((org.mockito.internal.verification.api.VerificationMode)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
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
  public void test17() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 3;
    Object v2 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v1).intValue()));
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v2),((org.mockito.internal.verification.api.VerificationMode)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 3;
    Object v2 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v1).intValue()));
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v5).intValue()));
    Object v7 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = 3;
    Object v9 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v7),((org.mockito.internal.verification.api.VerificationMode)v9));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 3;
    Object v2 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
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
  public void test29() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stub();
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 3;
    Object v2 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 3;
    Object v2 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v1).intValue()));
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v5).intValue()));
    Object v7 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v1),((org.mockito.internal.verification.api.VerificationMode)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = null;
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = true;
    Object v4 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v1),((org.mockito.MockSettings)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    Object v2 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = ((org.mockito.internal.MockitoCore)v0).getLastInvocation();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v4 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
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
  public void test39() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 3;
    Object v2 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
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
  public void test44() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 3;
    Object v2 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v1).intValue()));
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v5).intValue()));
    Object v7 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
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
  public void test47() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
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
  public void test49() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
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
  public void test51() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = null;
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = false;
    Object v4 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v1),((org.mockito.MockSettings)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = null;
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v5).intValue()));
    Object v7 = 3;
    Object v8 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v7).intValue()));
    Object v9 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v2),((java.util.List)v9));
    Object v11 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = 3;
    Object v2 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v1).intValue()));
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v5).intValue()));
    Object v7 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = null;
    Object v9 = 3;
    Object v10 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v9).intValue()));
    Object v11 = 3;
    Object v12 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v11).intValue()));
    Object v13 = 3;
    Object v14 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v13).intValue()));
    Object v15 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v8),((java.util.List)v15));
    Object v17 = new org.mockito.internal.verification.VerificationDataImpl(((java.util.List)v7),((org.mockito.internal.invocation.InvocationMatcher)v16));
    Object v18 = 3;
    Object v19 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v17),((org.mockito.internal.verification.api.VerificationMode)v19));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = null;
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = 3;
    Object v5 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v6).intValue()));
    Object v8 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v8));
    Object v10 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
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
  public void test57() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = null;
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = 3;
    Object v5 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v6).intValue()));
    Object v8 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v8));
    Object v10 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
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
  public void test59() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = null;
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = 3;
    Object v5 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v6).intValue()));
    Object v8 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v8));
    Object v10 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v5).intValue()));
    Object v7 = 3;
    Object v8 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v7).intValue()));
    Object v9 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = 3;
    Object v11 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v9),((org.mockito.internal.verification.api.VerificationMode)v11));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = 3;
    Object v5 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v3),((org.mockito.internal.verification.api.VerificationMode)v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v1),((org.mockito.internal.verification.api.VerificationMode)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = null;
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v5).intValue()));
    Object v7 = 3;
    Object v8 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v7).intValue()));
    Object v9 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v2),((java.util.List)v9));
    Object v11 = 3;
    Object v12 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v10),((org.mockito.internal.verification.api.VerificationMode)v12));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new org.mockito.internal.MockitoCore();
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v2),((org.mockito.internal.verification.api.VerificationMode)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new java.lang.Object[]{null,null,null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.internal.MockitoCore)v0).when(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
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
  public void test69() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = 3;
    Object v5 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v6).intValue()));
    Object v8 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = 3;
    Object v10 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v8),((org.mockito.internal.verification.api.VerificationMode)v10));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = null;
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = 3;
    Object v5 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v6).intValue()));
    Object v8 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v1),((java.util.List)v8));
    Object v10 = 3;
    Object v11 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v9),((org.mockito.internal.verification.api.VerificationMode)v11));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = false;
    Object v5 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = null;
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = 3;
    Object v6 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v5).intValue()));
    Object v7 = 3;
    Object v8 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v7).intValue()));
    Object v9 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v2),((java.util.List)v9));
    Object v11 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v2),((org.mockito.internal.verification.api.VerificationMode)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = ((org.mockito.internal.MockitoCore)v0).inOrder(((java.lang.Object[])v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
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
  public void test81() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).stubVoid(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
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
    Object v2 = 3;
    Object v3 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v2).intValue()));
    Object v4 = 3;
    Object v5 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v6).intValue()));
    Object v8 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = null;
    Object v10 = 3;
    Object v11 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v12).intValue()));
    Object v14 = 3;
    Object v15 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.List.of(((java.lang.Object)v11),((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = new org.mockito.internal.invocation.InvocationMatcher(((org.mockito.internal.invocation.Invocation)v9),((java.util.List)v16));
    Object v18 = new org.mockito.internal.verification.VerificationDataImpl(((java.util.List)v8),((org.mockito.internal.invocation.InvocationMatcher)v17));
    Object v19 = 3;
    Object v20 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v18),((org.mockito.internal.verification.api.VerificationMode)v20));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v2),((org.mockito.internal.verification.api.VerificationMode)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.MockitoCore)v0).stub(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.MissingMethodInvocationException");
    } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = false;
    Object v5 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = true;
    Object v5 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = 3;
    Object v4 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v2),((org.mockito.internal.verification.api.VerificationMode)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = false;
    Object v5 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.lang.Object[]{null,null};
    ((org.mockito.internal.MockitoCore)v0).verifyNoMoreInteractions(((java.lang.Object[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = ((java.lang.Class)v2).isMemberClass();
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v6 = java.lang.Class.forName(((java.lang.String)v5));
    Object v7 = ((org.mockito.MockSettings)v4).spiedInstance(((java.lang.Object)v6));
    Object v8 = false;
    Object v9 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v4),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "() mKthod on mock";
    Object v5 = ((org.mockito.MockSettings)v3).name(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v5 = ((org.mockito.MockSettings)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = true;
    Object v7 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v2 = ((org.mockito.internal.MockitoCore)v0).doAnswer(((org.mockito.stubbing.Answer)v1));
    Object v3 = new org.mockito.internal.MockitoCore();
    Object v4 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
    Object v5 = ((org.mockito.internal.MockitoCore)v3).doAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = 3;
    Object v7 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v5),((org.mockito.internal.verification.api.VerificationMode)v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.UnfinishedStubbingException");
    } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = java.lang.Class.forName(((java.lang.String)v4));
    Object v6 = ((org.mockito.MockSettings)v3).spiedInstance(((java.lang.Object)v5));
    Object v7 = false;
    Object v8 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v3),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = 3;
    Object v5 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.mockito.MockSettings)v3).spiedInstance(((java.lang.Object)v5));
    Object v7 = false;
    Object v8 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v3),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    ((org.mockito.internal.MockitoCore)v0).validateMockitoUsage();
    Object v1 = null;
    Object v2 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = true;
    Object v6 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v3),((org.mockito.MockSettings)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = new java.lang.Object[]{};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v1));
    Object v2 = null;
    Object v3 = new java.lang.Object[]{null};
    ((org.mockito.internal.MockitoCore)v0).reset(((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = ((java.lang.Class)v2).getEnclosingConstructor();
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = true;
    Object v6 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockitoCore();
    Object v1 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v2 = java.lang.Class.forName(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = true;
    Object v5 = ((org.mockito.internal.MockitoCore)v0).mock(((java.lang.Class)v2),((org.mockito.MockSettings)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = 3;
    Object v8 = new org.mockito.internal.verification.AtMost((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.mockito.internal.MockitoCore)v0).verify(((java.lang.Object)v6),((org.mockito.internal.verification.api.VerificationMode)v8));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }
}
