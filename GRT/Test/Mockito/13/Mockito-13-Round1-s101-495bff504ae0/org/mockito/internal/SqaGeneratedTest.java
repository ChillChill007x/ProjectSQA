package org.mockito.internal;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.MockHandler();
    Object v1 = null;
    Object v2 = ((org.mockito.internal.MockHandler)v0).handle(((org.mockito.internal.invocation.Invocation)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.mockito.internal.MockHandler();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = ((org.mockito.internal.MockHandler)v1).voidMethodStubbable(((java.lang.Object)v2));
    Object v4 = null;
    Object v5 = ((org.mockito.internal.MockHandler)v1).handle(((org.mockito.internal.invocation.Invocation)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getInvocationContainer();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v1).voidMethodStubbable(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.mockito.internal.MockHandler();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = java.util.List.of(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = ((java.util.List)v3).lastIndexOf(((java.lang.Object)v6));
    ((org.mockito.internal.MockHandler)v0).setAnswersForStubbing(((java.util.List)v3));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.internal.MockHandler)v2).voidMethodStubbable(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = null;
    Object v4 = ((org.mockito.internal.MockHandler)v2).handle(((org.mockito.internal.invocation.Invocation)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = java.util.List.of(((java.lang.Object)v2),((java.lang.Object)v3));
    ((org.mockito.internal.MockHandler)v1).setAnswersForStubbing(((java.util.List)v4));
    Object v5 = null;
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v7));
    Object v9 = ((org.mockito.internal.MockHandlerInterface)v8).getInvocationContainer();
    Object v10 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v8));
    Object v11 = ((org.mockito.internal.MockHandler)v1).voidMethodStubbable(((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v4));
    ((org.mockito.internal.MockHandler)v2).setAnswersForStubbing(((java.util.List)v5));
    Object v6 = null;
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = ((org.mockito.internal.MockHandler)v2).voidMethodStubbable(((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).defaultAnswer(((org.mockito.stubbing.Answer)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandler)v2).getInvocationContainer();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getInvocationContainer();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).defaultAnswer(((org.mockito.stubbing.Answer)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v7));
    ((org.mockito.internal.MockHandler)v5).setAnswersForStubbing(((java.util.List)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getInvocationContainer();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandlerInterface)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v7));
    Object v9 = ((org.mockito.internal.MockHandlerInterface)v8).getInvocationContainer();
    Object v10 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v8));
    Object v11 = ((org.mockito.internal.MockHandler)v5).voidMethodStubbable(((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = ((org.mockito.internal.MockHandler)v4).getInvocationContainer();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    ((org.mockito.internal.MockHandler)v3).setAnswersForStubbing(((java.util.List)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v9 = java.util.List.of(((java.lang.Object)v7),((java.lang.Object)v8));
    ((org.mockito.internal.MockHandler)v6).setAnswersForStubbing(((java.util.List)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    ((org.mockito.internal.MockHandler)v3).setAnswersForStubbing(((java.util.List)v6));
    Object v7 = null;
    Object v8 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v9 = ((org.mockito.internal.MockHandler)v3).voidMethodStubbable(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v6));
    ((org.mockito.internal.MockHandler)v4).setAnswersForStubbing(((java.util.List)v7));
    Object v8 = null;
    Object v9 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v10 = ((org.mockito.internal.MockHandler)v4).voidMethodStubbable(((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v9 = java.util.List.of(((java.lang.Object)v7),((java.lang.Object)v8));
    ((org.mockito.internal.MockHandler)v6).setAnswersForStubbing(((java.util.List)v9));
    Object v10 = null;
    Object v11 = ((org.mockito.internal.MockHandler)v6).getInvocationContainer();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = ((org.mockito.internal.MockHandler)v4).getMockSettings();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = ((org.mockito.internal.MockHandler)v3).voidMethodStubbable(((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v5));
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v6));
    Object v8 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v7));
    Object v9 = ((org.mockito.internal.MockHandler)v4).voidMethodStubbable(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = null;
    Object v6 = ((org.mockito.internal.MockHandler)v4).handle(((org.mockito.internal.invocation.Invocation)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v6));
    ((org.mockito.internal.MockHandlerInterface)v4).setAnswersForStubbing(((java.util.List)v7));
    Object v8 = null;
    Object v9 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    ((org.mockito.internal.MockHandler)v3).setAnswersForStubbing(((java.util.List)v6));
    Object v7 = null;
    Object v8 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v6));
    ((org.mockito.internal.MockHandlerInterface)v4).setAnswersForStubbing(((java.util.List)v7));
    Object v8 = null;
    Object v9 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v10 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v11 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v12 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v11));
    ((org.mockito.internal.MockHandler)v9).setAnswersForStubbing(((java.util.List)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandler)v2).getMockSettings();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandlerInterface)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getInvocationContainer();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = ((java.util.List)v6).spliterator();
    ((org.mockito.internal.MockHandler)v3).setAnswersForStubbing(((java.util.List)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = ((org.mockito.internal.MockHandler)v7).getMockSettings();
    Object v9 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v8));
    Object v10 = ((org.mockito.internal.MockHandler)v5).voidMethodStubbable(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.MockHandler)v1).voidMethodStubbable(((java.lang.Object)v10));
    Object v12 = null;
    Object v13 = ((org.mockito.internal.MockHandler)v1).handle(((org.mockito.internal.invocation.Invocation)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandlerInterface)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v4 = null;
    Object v5 = ((org.mockito.internal.MockHandler)v3).handle(((org.mockito.internal.invocation.Invocation)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    ((org.mockito.internal.MockHandler)v3).setAnswersForStubbing(((java.util.List)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    Object v7 = ((org.mockito.internal.MockHandler)v6).getMockSettings();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v5));
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v6));
    Object v8 = ((org.mockito.internal.MockHandlerInterface)v7).getInvocationContainer();
    Object v9 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v7));
    Object v10 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v9));
    Object v11 = ((org.mockito.internal.MockHandler)v4).voidMethodStubbable(((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandlerInterface)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    Object v7 = ((org.mockito.internal.MockHandlerInterface)v6).getInvocationContainer();
    Object v8 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v6));
    Object v9 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v10 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v9));
    Object v11 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v10));
    Object v12 = ((org.mockito.internal.MockHandlerInterface)v11).getInvocationContainer();
    Object v13 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v11));
    Object v14 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v13));
    Object v15 = ((org.mockito.internal.MockHandler)v8).voidMethodStubbable(((java.lang.Object)v14));
    Object v16 = ((org.mockito.internal.MockHandler)v3).voidMethodStubbable(((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v6));
    ((org.mockito.internal.MockHandler)v4).setAnswersForStubbing(((java.util.List)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v5 = ((org.mockito.internal.MockHandler)v3).voidMethodStubbable(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = ((org.mockito.internal.MockHandler)v7).getMockSettings();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = null;
    Object v3 = ((org.mockito.internal.MockHandler)v1).handle(((org.mockito.internal.invocation.Invocation)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = null;
    Object v7 = ((org.mockito.internal.MockHandler)v5).handle(((org.mockito.internal.invocation.Invocation)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = ((org.mockito.internal.MockHandler)v4).getInvocationContainer();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v7));
    ((org.mockito.internal.MockHandler)v5).setAnswersForStubbing(((java.util.List)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    Object v7 = ((org.mockito.internal.MockHandler)v6).getMockSettings();
    Object v8 = ((org.mockito.internal.MockHandler)v3).voidMethodStubbable(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getInvocationContainer();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = null;
    Object v9 = ((org.mockito.internal.MockHandler)v7).handle(((org.mockito.internal.invocation.Invocation)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.mockito.internal.MockHandler();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v1));
    Object v3 = ((org.mockito.internal.MockHandler)v2).getMockSettings();
    Object v4 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v3));
    Object v7 = ((org.mockito.internal.MockHandlerInterface)v0).voidMethodStubbable(((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v0));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v9 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v12 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v11));
    Object v13 = ((org.mockito.internal.MockHandler)v12).getInvocationContainer();
    Object v14 = ((java.util.List)v10).contains(((java.lang.Object)v13));
    ((org.mockito.internal.MockHandler)v7).setAnswersForStubbing(((java.util.List)v10));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getInvocationContainer();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v3));
    Object v5 = ((org.mockito.internal.MockHandlerInterface)v4).getMockSettings();
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v7 = ((org.mockito.internal.MockHandler)v6).getInvocationContainer();
    Object v8 = ((org.mockito.internal.MockHandler)v2).voidMethodStubbable(((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = null;
    Object v9 = ((org.mockito.internal.MockHandler)v7).handle(((org.mockito.internal.invocation.Invocation)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getInvocationContainer();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = ((org.mockito.internal.MockHandler)v7).getMockSettings();
    Object v9 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v8));
    Object v10 = ((org.mockito.internal.MockHandler)v9).getMockSettings();
    Object v11 = ((org.mockito.internal.MockHandler)v5).voidMethodStubbable(((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = "Cannot create a @S.py for '";
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).name(((java.lang.String)v7));
    Object v9 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandler)v2).getMockSettings();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandler)v2).getMockSettings();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v3));
    Object v5 = ((org.mockito.internal.MockHandler)v4).getInvocationContainer();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = ((java.util.List)v6).toArray();
    ((org.mockito.internal.MockHandler)v3).setAnswersForStubbing(((java.util.List)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = ((org.mockito.internal.MockHandler)v1).voidMethodStubbable(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandler)v2).getMockSettings();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v3));
    Object v5 = null;
    Object v6 = ((org.mockito.internal.MockHandler)v4).handle(((org.mockito.internal.invocation.Invocation)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandler)v2).getMockSettings();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v3));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v5));
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v6));
    Object v8 = ((org.mockito.internal.MockHandlerInterface)v7).getInvocationContainer();
    Object v9 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v7));
    Object v10 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v9));
    Object v11 = ((org.mockito.internal.MockHandler)v10).getMockSettings();
    Object v12 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v11));
    Object v13 = ((org.mockito.internal.MockHandler)v12).getMockSettings();
    Object v14 = ((org.mockito.internal.MockHandler)v4).voidMethodStubbable(((java.lang.Object)v13));
    Object v15 = null;
    Object v16 = ((org.mockito.internal.MockHandler)v4).handle(((org.mockito.internal.invocation.Invocation)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.mockito.internal.MockHandler();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v1));
    Object v3 = ((org.mockito.internal.MockHandler)v2).getMockSettings();
    Object v4 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v3));
    Object v7 = ((org.mockito.internal.MockHandlerInterface)v0).voidMethodStubbable(((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v0));
    Object v9 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v10 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v9));
    Object v11 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v10));
    Object v12 = ((org.mockito.internal.MockHandlerInterface)v11).getInvocationContainer();
    Object v13 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v11));
    Object v14 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v13));
    Object v15 = ((org.mockito.internal.MockHandler)v14).getMockSettings();
    Object v16 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v15));
    Object v17 = ((org.mockito.internal.MockHandler)v8).voidMethodStubbable(((java.lang.Object)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = null;
    Object v7 = ((org.mockito.internal.MockHandler)v5).handle(((org.mockito.internal.invocation.Invocation)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v7));
    Object v9 = ((org.mockito.internal.MockHandler)v8).getMockSettings();
    Object v10 = ((org.mockito.internal.MockHandler)v5).voidMethodStubbable(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v12 = ((org.mockito.internal.MockHandlerInterface)v1).voidMethodStubbable(((java.lang.Object)v11));
    Object v13 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v7));
    ((org.mockito.internal.MockHandler)v5).setAnswersForStubbing(((java.util.List)v8));
    Object v9 = null;
    Object v10 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v11 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v10));
    Object v12 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v11));
    Object v13 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v12));
    Object v14 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v15 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v14));
    Object v16 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v15));
    Object v17 = ((org.mockito.internal.MockHandler)v16).getMockSettings();
    Object v18 = ((org.mockito.internal.MockHandler)v13).voidMethodStubbable(((java.lang.Object)v17));
    Object v19 = ((org.mockito.internal.MockHandler)v13).getMockSettings();
    Object v20 = ((org.mockito.internal.MockHandler)v5).voidMethodStubbable(((java.lang.Object)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v9 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    ((org.mockito.internal.MockHandler)v7).setAnswersForStubbing(((java.util.List)v10));
    Object v11 = null;
    Object v12 = ((org.mockito.internal.MockHandler)v7).getMockSettings();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    Object v7 = ((org.mockito.internal.MockHandler)v6).getMockSettings();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v9 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    ((org.mockito.internal.MockHandler)v7).setAnswersForStubbing(((java.util.List)v10));
    Object v11 = null;
    Object v12 = ((org.mockito.internal.MockHandler)v7).getMockSettings();
    Object v13 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v7));
    Object v9 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v8));
    Object v10 = ((org.mockito.internal.MockHandlerInterface)v9).getInvocationContainer();
    Object v11 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v9));
    Object v12 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v11));
    Object v13 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v12));
    Object v14 = ((org.mockito.internal.MockHandler)v13).getMockSettings();
    Object v15 = ((org.mockito.internal.MockHandler)v6).voidMethodStubbable(((java.lang.Object)v14));
    Object v16 = null;
    Object v17 = new org.mockito.internal.creation.DelegatingMockitoMethodProxy(((org.mockito.cglib.proxy.MethodProxy)v16));
    Object v18 = ((org.mockito.internal.MockHandler)v6).voidMethodStubbable(((java.lang.Object)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v9 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v8));
    Object v10 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v9));
    Object v11 = ((org.mockito.internal.MockHandler)v10).getMockSettings();
    Object v12 = ((org.mockito.internal.MockHandler)v7).voidMethodStubbable(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    Object v7 = ((org.mockito.internal.MockHandler)v6).getMockSettings();
    Object v8 = ((org.mockito.internal.MockHandler)v3).voidMethodStubbable(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v10 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v5));
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v6));
    Object v8 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v9 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v8));
    Object v10 = ((org.mockito.internal.MockHandler)v9).getMockSettings();
    Object v11 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v10));
    Object v12 = ((org.mockito.internal.MockHandler)v11).getMockSettings();
    Object v13 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v12));
    Object v14 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v13));
    Object v15 = ((org.mockito.internal.MockHandler)v7).voidMethodStubbable(((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v3));
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v4));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v7));
    ((org.mockito.internal.MockHandler)v5).setAnswersForStubbing(((java.util.List)v8));
    Object v9 = null;
    Object v10 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v11 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v12 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v11));
    ((org.mockito.internal.MockHandler)v5).setAnswersForStubbing(((java.util.List)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getMockSettings();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.mockito.internal.MockHandler();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v1));
    Object v3 = ((org.mockito.internal.MockHandler)v2).getMockSettings();
    Object v4 = new org.mockito.internal.stubbing.answers.ClonesArguments();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v3));
    Object v7 = ((org.mockito.internal.MockHandlerInterface)v0).voidMethodStubbable(((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v0));
    Object v9 = ((org.mockito.internal.MockHandler)v8).getInvocationContainer();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v1));
    Object v3 = ((org.mockito.internal.MockHandlerInterface)v2).getMockSettings();
    Object v4 = new org.mockito.internal.MockHandler(((org.mockito.internal.MockHandlerInterface)v2));
    Object v5 = null;
    Object v6 = ((org.mockito.internal.MockHandler)v4).handle(((org.mockito.internal.invocation.Invocation)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v0));
    Object v2 = ((org.mockito.internal.MockHandler)v1).getMockSettings();
    Object v3 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v2));
    Object v4 = ((org.mockito.internal.MockHandler)v3).getMockSettings();
    Object v5 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v4));
    Object v6 = ((org.mockito.internal.MockHandler)v5).getMockSettings();
    Object v7 = new org.mockito.internal.MockHandler(((org.mockito.internal.creation.MockSettingsImpl)v6));
    Object v8 = ((org.mockito.internal.MockHandler)v7).getInvocationContainer();
    org.junit.Assert.assertNotNull(v8);
  }
}
