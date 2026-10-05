package org.mockito.internal.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).getMockHandler(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    ((org.mockito.internal.util.MockUtil)v1).resetMock(((java.lang.Object)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    ((org.mockito.internal.util.MockUtil)v1).resetMock(((java.lang.Object)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = new org.mockito.internal.util.MockCreationValidator();
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).getMockName(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).getMockName(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = java.lang.ClassLoader.getSystemClassLoader();
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = new org.mockito.internal.util.MockCreationValidator();
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).getMockHandler(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = null;
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.internal.util.MockUtil)v1).createMock(((java.lang.Class)v2),((org.mockito.internal.creation.MockSettingsImpl)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v3));
    Object v5 = new org.mockito.internal.util.MockCreationValidator();
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).getMockName(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v1));
    Object v3 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v1));
    Object v3 = new org.mockito.internal.util.MockCreationValidator();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v4));
    Object v6 = new org.mockito.internal.util.MockCreationValidator();
    Object v7 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v2));
    Object v4 = new org.mockito.internal.util.MockCreationValidator();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockCreationValidator();
    Object v8 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = null;
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = ((org.mockito.internal.util.MockUtil)v0).createMock(((java.lang.Class)v1),((org.mockito.internal.creation.MockSettingsImpl)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockCreationValidator();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v3));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.util.MockCreationValidator();
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).getMockName(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockCreationValidator();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v7));
    Object v9 = new org.mockito.internal.util.MockUtil();
    Object v10 = new org.mockito.internal.util.MockCreationValidator();
    Object v11 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v10));
    Object v12 = ((org.mockito.internal.util.MockUtil)v9).isMock(((java.lang.Object)v11));
    ((org.mockito.internal.util.MockUtil)v0).resetMock(((java.lang.Object)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v3));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockCreationValidator();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockCreationValidator();
    Object v4 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    ((org.mockito.internal.util.MockUtil)v0).resetMock(((java.lang.Object)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v4));
    Object v6 = new org.mockito.internal.util.MockUtil();
    Object v7 = new org.mockito.internal.util.MockUtil();
    Object v8 = new org.mockito.internal.util.MockCreationValidator();
    Object v9 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v8));
    Object v10 = new org.mockito.internal.util.MockCreationValidator();
    Object v11 = ((org.mockito.internal.util.MockUtil)v9).isMock(((java.lang.Object)v10));
    Object v12 = ((org.mockito.internal.util.MockUtil)v7).isMock(((java.lang.Object)v11));
    Object v13 = new org.mockito.internal.util.MockCreationValidator();
    Object v14 = ((org.mockito.internal.util.MockUtil)v7).isMock(((java.lang.Object)v13));
    Object v15 = ((org.mockito.internal.util.MockUtil)v6).isMock(((java.lang.Object)v14));
    Object v16 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = null;
    Object v2 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).createMock(((java.lang.Class)v1),((org.mockito.internal.creation.MockSettingsImpl)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockUtil();
    Object v8 = new org.mockito.internal.util.MockCreationValidator();
    Object v9 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v7).isMock(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockCreationValidator();
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v2));
    Object v4 = new org.mockito.internal.util.MockCreationValidator();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockCreationValidator();
    Object v8 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v0).getMockName(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockCreationValidator();
    Object v4 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v3));
    Object v5 = new org.mockito.internal.util.MockCreationValidator();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.util.MockCreationValidator();
    Object v9 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockCreationValidator();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = new org.mockito.internal.util.MockUtil();
    Object v6 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = java.lang.ClassLoader.getSystemClassLoader();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockCreationValidator();
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).getMockName(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockCreationValidator();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = new org.mockito.internal.util.MockUtil();
    Object v7 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v7));
    Object v9 = new org.mockito.internal.util.MockUtil();
    Object v10 = new org.mockito.internal.util.MockUtil();
    Object v11 = ((org.mockito.internal.util.MockUtil)v9).isMock(((java.lang.Object)v10));
    Object v12 = new org.mockito.internal.util.MockUtil();
    Object v13 = new org.mockito.internal.util.MockCreationValidator();
    Object v14 = ((org.mockito.internal.util.MockUtil)v12).isMock(((java.lang.Object)v13));
    Object v15 = ((org.mockito.internal.util.MockUtil)v9).isMock(((java.lang.Object)v14));
    Object v16 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockCreationValidator();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = new org.mockito.internal.util.MockUtil();
    Object v6 = new org.mockito.internal.util.MockCreationValidator();
    Object v7 = ((org.mockito.internal.util.MockUtil)v5).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockCreationValidator();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = new org.mockito.internal.util.MockUtil();
    Object v6 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v7));
    Object v9 = new org.mockito.internal.util.MockUtil();
    Object v10 = new org.mockito.internal.util.MockUtil();
    Object v11 = new org.mockito.internal.util.MockCreationValidator();
    Object v12 = ((org.mockito.internal.util.MockUtil)v10).isMock(((java.lang.Object)v11));
    Object v13 = new org.mockito.internal.util.MockUtil();
    Object v14 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v15 = ((org.mockito.internal.util.MockUtil)v13).isMock(((java.lang.Object)v14));
    Object v16 = ((org.mockito.internal.util.MockUtil)v10).isMock(((java.lang.Object)v15));
    Object v17 = ((org.mockito.internal.util.MockUtil)v9).isMock(((java.lang.Object)v16));
    Object v18 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v17));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v3));
    Object v5 = new org.mockito.internal.util.MockUtil();
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = ((org.mockito.internal.util.MockUtil)v5).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockUtil();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockUtil();
    Object v8 = new org.mockito.internal.util.MockCreationValidator();
    Object v9 = ((org.mockito.internal.util.MockUtil)v7).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v10));
    ((org.mockito.internal.util.MockUtil)v0).resetMock(((java.lang.Object)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = java.lang.ClassLoader.getSystemClassLoader();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = new org.mockito.internal.util.MockUtil();
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = ((org.mockito.internal.util.MockUtil)v6).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v9));
    Object v11 = new org.mockito.internal.util.MockUtil();
    Object v12 = new org.mockito.internal.util.MockUtil();
    Object v13 = ((org.mockito.internal.util.MockUtil)v11).isMock(((java.lang.Object)v12));
    Object v14 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v1));
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockCreationValidator();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockUtil();
    Object v8 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = java.lang.ClassLoader.getSystemClassLoader();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = new org.mockito.internal.util.MockUtil();
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = ((org.mockito.internal.util.MockUtil)v6).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v2));
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockUtil();
    Object v6 = new org.mockito.internal.util.MockCreationValidator();
    Object v7 = ((org.mockito.internal.util.MockUtil)v5).isMock(((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.util.MockUtil();
    Object v9 = ((org.mockito.internal.util.MockUtil)v5).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v10));
    Object v12 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v11));
    Object v13 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v12));
    Object v14 = new org.mockito.internal.util.MockUtil();
    Object v15 = new org.mockito.internal.util.MockUtil();
    Object v16 = new org.mockito.internal.util.MockUtil();
    Object v17 = ((org.mockito.internal.util.MockUtil)v15).isMock(((java.lang.Object)v16));
    Object v18 = ((org.mockito.internal.util.MockUtil)v14).isMock(((java.lang.Object)v17));
    Object v19 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v20 = ((org.mockito.internal.util.MockUtil)v14).isMock(((java.lang.Object)v19));
    ((org.mockito.internal.util.MockUtil)v0).resetMock(((java.lang.Object)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockCreationValidator();
    Object v4 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.util.MockUtil();
    Object v9 = new org.mockito.internal.util.MockCreationValidator();
    Object v10 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v9));
    Object v11 = new org.mockito.internal.util.MockCreationValidator();
    Object v12 = ((org.mockito.internal.util.MockUtil)v10).isMock(((java.lang.Object)v11));
    Object v13 = ((org.mockito.internal.util.MockUtil)v8).isMock(((java.lang.Object)v12));
    Object v14 = new org.mockito.internal.util.MockCreationValidator();
    Object v15 = ((org.mockito.internal.util.MockUtil)v8).isMock(((java.lang.Object)v14));
    Object v16 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).getMockName(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockCreationValidator();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = new org.mockito.internal.util.MockUtil();
    Object v7 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v1));
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockCreationValidator();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockUtil();
    Object v8 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.util.MockUtil();
    Object v9 = new org.mockito.internal.util.MockUtil();
    Object v10 = new org.mockito.internal.util.MockUtil();
    Object v11 = ((org.mockito.internal.util.MockUtil)v9).isMock(((java.lang.Object)v10));
    Object v12 = ((org.mockito.internal.util.MockUtil)v8).isMock(((java.lang.Object)v11));
    Object v13 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockCreationValidator();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockUtil();
    Object v8 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v10));
    Object v12 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = java.lang.ClassLoader.getSystemClassLoader();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockCreationValidator();
    Object v8 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v7));
    Object v9 = new org.mockito.internal.util.MockUtil();
    Object v10 = new org.mockito.internal.util.MockUtil();
    Object v11 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v12 = ((org.mockito.internal.util.MockUtil)v10).isMock(((java.lang.Object)v11));
    Object v13 = ((org.mockito.internal.util.MockUtil)v9).isMock(((java.lang.Object)v12));
    Object v14 = ((org.mockito.internal.util.MockUtil)v8).isMock(((java.lang.Object)v13));
    Object v15 = new org.mockito.internal.util.MockUtil();
    Object v16 = new org.mockito.internal.util.MockUtil();
    Object v17 = new org.mockito.internal.util.MockUtil();
    Object v18 = ((org.mockito.internal.util.MockUtil)v16).isMock(((java.lang.Object)v17));
    Object v19 = ((org.mockito.internal.util.MockUtil)v15).isMock(((java.lang.Object)v18));
    Object v20 = ((org.mockito.internal.util.MockUtil)v8).isMock(((java.lang.Object)v19));
    Object v21 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockUtil();
    Object v6 = new org.mockito.internal.util.MockCreationValidator();
    Object v7 = ((org.mockito.internal.util.MockUtil)v5).isMock(((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.util.MockUtil();
    Object v9 = ((org.mockito.internal.util.MockUtil)v5).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v10));
    Object v12 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v11));
    Object v13 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v12));
    Object v14 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v2));
    Object v4 = new org.mockito.internal.util.MockCreationValidator();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockCreationValidator();
    Object v8 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = java.lang.ClassLoader.getSystemClassLoader();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockCreationValidator();
    Object v4 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v5));
    ((org.mockito.internal.util.MockUtil)v0).resetMock(((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v2));
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockUtil();
    Object v6 = new org.mockito.internal.util.MockCreationValidator();
    Object v7 = ((org.mockito.internal.util.MockUtil)v5).isMock(((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.util.MockUtil();
    Object v9 = ((org.mockito.internal.util.MockUtil)v5).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v10));
    Object v12 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v11));
    Object v13 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v12));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v3));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = new org.mockito.internal.util.MockUtil();
    Object v7 = new org.mockito.internal.util.MockCreationValidator();
    Object v8 = ((org.mockito.internal.util.MockUtil)v6).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v9));
    Object v11 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v10));
    Object v12 = ((org.mockito.internal.util.MockUtil)v0).getMockName(((java.lang.Object)v11));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockCreationValidator();
    Object v1 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v0));
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v1));
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockUtil();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v7));
    ((org.mockito.internal.util.MockUtil)v0).resetMock(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v2));
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockCreationValidator();
    Object v3 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v2));
    Object v4 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v4));
    Object v6 = new org.mockito.internal.util.MockUtil();
    Object v7 = new org.mockito.internal.util.MockUtil();
    Object v8 = java.lang.ClassLoader.getSystemClassLoader();
    Object v9 = ((org.mockito.internal.util.MockUtil)v7).isMock(((java.lang.Object)v8));
    Object v10 = ((org.mockito.internal.util.MockUtil)v6).isMock(((java.lang.Object)v9));
    ((org.mockito.internal.util.MockUtil)v0).resetMock(((java.lang.Object)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v1));
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.util.MockUtil();
    Object v5 = new org.mockito.internal.util.MockUtil();
    Object v6 = ((org.mockito.internal.util.MockUtil)v4).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v7));
    Object v9 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.util.MockUtil();
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = ((org.mockito.internal.util.MockUtil)v3).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v6));
    Object v8 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = new org.mockito.internal.util.MockUtil();
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = ((org.mockito.internal.util.MockUtil)v1).isMock(((java.lang.Object)v4));
    Object v6 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.util.MockUtil();
    Object v8 = new org.mockito.internal.util.MockUtil();
    Object v9 = new org.mockito.internal.util.MockCreationValidator();
    Object v10 = ((org.mockito.internal.util.MockUtil)v8).isMock(((java.lang.Object)v9));
    Object v11 = new org.mockito.internal.util.MockUtil();
    Object v12 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v13 = ((org.mockito.internal.util.MockUtil)v11).isMock(((java.lang.Object)v12));
    Object v14 = ((org.mockito.internal.util.MockUtil)v8).isMock(((java.lang.Object)v13));
    Object v15 = ((org.mockito.internal.util.MockUtil)v7).isMock(((java.lang.Object)v14));
    Object v16 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockUtil();
    Object v2 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v1));
    Object v3 = new org.mockito.internal.util.MockCreationValidator();
    Object v4 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.MockUtil();
    Object v1 = new org.mockito.internal.util.MockCreationValidator();
    Object v2 = new org.mockito.internal.util.MockUtil(((org.mockito.internal.util.MockCreationValidator)v1));
    Object v3 = new org.mockito.internal.util.MockCreationValidator();
    Object v4 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v3));
    Object v5 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v6 = ((org.mockito.internal.util.MockUtil)v2).isMock(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.util.MockUtil)v0).isMock(((java.lang.Object)v6));
    Object v8 = new org.mockito.internal.util.MockUtil();
    Object v9 = new org.mockito.internal.util.MockUtil();
    Object v10 = new org.mockito.internal.util.MockUtil();
    Object v11 = java.lang.ClassLoader.getSystemClassLoader();
    Object v12 = ((org.mockito.internal.util.MockUtil)v10).isMock(((java.lang.Object)v11));
    Object v13 = ((org.mockito.internal.util.MockUtil)v9).isMock(((java.lang.Object)v12));
    Object v14 = new org.mockito.internal.util.MockUtil();
    Object v15 = java.lang.ClassLoader.getSystemClassLoader();
    Object v16 = ((org.mockito.internal.util.MockUtil)v14).isMock(((java.lang.Object)v15));
    Object v17 = ((org.mockito.internal.util.MockUtil)v9).isMock(((java.lang.Object)v16));
    Object v18 = ((org.mockito.internal.util.MockUtil)v8).isMock(((java.lang.Object)v17));
    Object v19 = ((org.mockito.internal.util.MockUtil)v0).getMockHandler(((java.lang.Object)v18));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }
}
