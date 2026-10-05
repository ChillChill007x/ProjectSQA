package org.mockito.internal.creation.bytebuddy;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getOuterClassInstance();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).getInvocationListeners();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).getOuterClassInstance();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getSerializableMode();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).isUsingConstructor();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).isStubOnly();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).isSerializable();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).getMockName();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).getSerializableMode();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).isUsingConstructor();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).getExtraInterfaces();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getSpiedInstance();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).isSerializable();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).getTypeToMock();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getTypeToMock();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getDefaultAnswer();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).isStubOnly();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getInvocationListeners();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).getSerializableMode();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).getSpiedInstance();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getExtraInterfaces();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getSerializableMode();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).getSpiedInstance();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getMockName();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.mock.MockCreationSettings)v1).getDefaultAnswer();
    Object v3 = null;
    Object v4 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v1),((org.mockito.invocation.MockHandler)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getExtraInterfaces();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getMockName();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getOuterClassInstance();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).getExtraInterfaces();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getDefaultAnswer();
    Object v5 = null;
    Object v6 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).createMock(((org.mockito.mock.MockCreationSettings)v3),((org.mockito.invocation.MockHandler)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).isUsingConstructor();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getTypeToMock();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).isStubOnly();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).isUsingConstructor();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).isStubOnly();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).getMockName();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).getTypeToMock();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).isSerializable();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).getInvocationListeners();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getSpiedInstance();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getInvocationListeners();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).isStubOnly();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).getOuterClassInstance();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).isSerializable();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.mock.MockCreationSettings)v5).getDefaultAnswer();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).getTypeToMock();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).getHandler(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v4 = null;
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v3),((org.mockito.invocation.MockHandler)v4),((org.mockito.mock.MockCreationSettings)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v1 = new org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker();
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.mock.MockCreationSettings)v3).isSerializable();
    ((org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker)v0).resetMock(((java.lang.Object)v1),((org.mockito.invocation.MockHandler)v2),((org.mockito.mock.MockCreationSettings)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
