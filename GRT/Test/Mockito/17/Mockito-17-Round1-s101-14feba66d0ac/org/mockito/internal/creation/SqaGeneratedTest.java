package org.mockito.internal.creation;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = ((org.mockito.internal.creation.MockSettingsImpl)v0).getSpiedInstance();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new java.lang.Class[]{null};
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).extraInterfaces(((java.lang.Class[])v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = new java.lang.Class[]{null,null};
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).extraInterfaces(((java.lang.Class[])v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = ((org.mockito.internal.creation.MockSettingsImpl)v0).getExtraInterfaces();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).getMockName();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = ((org.mockito.internal.creation.MockSettingsImpl)v0).isSerializable();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).defaultAnswer(((org.mockito.stubbing.Answer)v3));
    Object v5 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = ((org.mockito.internal.creation.MockSettingsImpl)v0).getDefaultAnswer();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new java.lang.Class[]{null};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).defaultAnswer(((org.mockito.stubbing.Answer)v3));
    Object v5 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new java.lang.Class[]{null};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).getExtraInterfaces();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = new java.lang.Class[]{null,null,null};
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).extraInterfaces(((java.lang.Class[])v10));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new java.lang.Class[]{null,null,null};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).getMockName();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v5).extraInterfaces(((java.lang.Class[])v6));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).defaultAnswer(((org.mockito.stubbing.Answer)v3));
    Object v5 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).getDefaultAnswer();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).defaultAnswer(((org.mockito.stubbing.Answer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v8).getExtraInterfaces();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v3));
    Object v5 = "Verification in order failure";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = ((org.mockito.internal.creation.MockSettingsImpl)v9).getExtraInterfaces();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = "";
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).name(((java.lang.String)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v9).serializable();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).defaultAnswer(((org.mockito.stubbing.Answer)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v9).getMockName();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new java.lang.Class[]{null};
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).extraInterfaces(((java.lang.Class[])v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).defaultAnswer(((org.mockito.stubbing.Answer)v3));
    Object v5 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new java.lang.Class[]{};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v3).getDefaultAnswer();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v3));
    Object v5 = "Verification in order failure";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).getMockName();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v6));
    Object v8 = new java.lang.Class[]{null,null};
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v7).extraInterfaces(((java.lang.Class[])v8));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new java.lang.Class[]{};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v5 = "";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).name(((java.lang.String)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v8 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v7).defaultAnswer(((org.mockito.stubbing.Answer)v8));
    Object v10 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v7).defaultAnswer(((org.mockito.stubbing.Answer)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v3).spiedInstance(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v6));
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v7).serializable();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = ((org.mockito.internal.creation.MockSettingsImpl)v9).getSpiedInstance();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new java.lang.Class[]{null,null,null};
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).extraInterfaces(((java.lang.Class[])v3));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v3));
    Object v5 = "Verification in order failure";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).getDefaultAnswer();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v3).getSpiedInstance();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v3));
    Object v5 = "Verification in order failure";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).getMockName();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = new java.lang.Class[]{null,null,null};
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v4).extraInterfaces(((java.lang.Class[])v6));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v10 = "";
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).name(((java.lang.String)v10));
    Object v12 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v13 = "";
    Object v14 = ((org.mockito.internal.creation.MockSettingsImpl)v12).name(((java.lang.String)v13));
    Object v15 = ((org.mockito.internal.creation.MockSettingsImpl)v11).spiedInstance(((java.lang.Object)v14));
    Object v16 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v17 = ((org.mockito.internal.creation.MockSettingsImpl)v15).defaultAnswer(((org.mockito.stubbing.Answer)v16));
    Object v18 = ((org.mockito.internal.creation.MockSettingsImpl)v15).serializable();
    Object v19 = "";
    Object v20 = ((org.mockito.internal.creation.MockSettingsImpl)v18).name(((java.lang.String)v19));
    Object v21 = ((org.mockito.internal.creation.MockSettingsImpl)v18).serializable();
    Object v22 = ((org.mockito.internal.creation.MockSettingsImpl)v8).spiedInstance(((java.lang.Object)v21));
    Object v23 = new java.lang.Class[]{};
    Object v24 = ((org.mockito.internal.creation.MockSettingsImpl)v8).extraInterfaces(((java.lang.Class[])v23));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = new java.lang.Class[]{null,null,null};
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).extraInterfaces(((java.lang.Class[])v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v3));
    Object v5 = "Verification in order failure";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v5));
    Object v7 = new java.lang.Class[]{};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).name(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = new java.lang.Class[]{null,null};
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).extraInterfaces(((java.lang.Class[])v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).isSerializable();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).name(((java.lang.String)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).getMockName();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = "";
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).name(((java.lang.String)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v9).serializable();
    Object v13 = new java.lang.Class[]{};
    Object v14 = ((org.mockito.internal.creation.MockSettingsImpl)v12).extraInterfaces(((java.lang.Class[])v13));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).name(((java.lang.String)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v8 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v9 = "";
    Object v10 = ((org.mockito.internal.creation.MockSettingsImpl)v8).name(((java.lang.String)v9));
    Object v11 = ",Y ";
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v10).name(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = ((org.mockito.internal.creation.MockSettingsImpl)v12).name(((java.lang.String)v13));
    Object v15 = ((org.mockito.internal.creation.MockSettingsImpl)v6).spiedInstance(((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = new java.lang.Class[]{};
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).extraInterfaces(((java.lang.Class[])v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v6));
    Object v8 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v9 = "";
    Object v10 = ((org.mockito.internal.creation.MockSettingsImpl)v8).name(((java.lang.String)v9));
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v10).serializable();
    Object v12 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v13 = ((org.mockito.internal.creation.MockSettingsImpl)v11).defaultAnswer(((org.mockito.stubbing.Answer)v12));
    Object v14 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v15 = ((org.mockito.internal.creation.MockSettingsImpl)v11).defaultAnswer(((org.mockito.stubbing.Answer)v14));
    Object v16 = ((org.mockito.internal.creation.MockSettingsImpl)v7).spiedInstance(((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).name(((java.lang.String)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v8 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v9 = "";
    Object v10 = ((org.mockito.internal.creation.MockSettingsImpl)v8).name(((java.lang.String)v9));
    Object v11 = ",Y ";
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v10).name(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = ((org.mockito.internal.creation.MockSettingsImpl)v12).name(((java.lang.String)v13));
    Object v15 = ((org.mockito.internal.creation.MockSettingsImpl)v6).spiedInstance(((java.lang.Object)v14));
    Object v16 = ((org.mockito.internal.creation.MockSettingsImpl)v15).getMockName();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v8).serializable();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = "";
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).name(((java.lang.String)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v9).serializable();
    Object v13 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v14 = ((org.mockito.internal.creation.MockSettingsImpl)v12).defaultAnswer(((org.mockito.stubbing.Answer)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).defaultAnswer(((org.mockito.stubbing.Answer)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).getMockName();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).defaultAnswer(((org.mockito.stubbing.Answer)v3));
    Object v5 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v8 = new java.lang.Class[]{};
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v8));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = "";
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v5).name(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = "\n-";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v5).extraInterfaces(((java.lang.Class[])v6));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v5).getDefaultAnswer();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new java.lang.Class[]{null};
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).extraInterfaces(((java.lang.Class[])v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = "";
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).name(((java.lang.String)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v9).serializable();
    Object v13 = ((org.mockito.internal.creation.MockSettingsImpl)v12).getDefaultAnswer();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = new java.lang.Class[]{null,null,null};
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v5).extraInterfaces(((java.lang.Class[])v6));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v5).serializable();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = "";
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).name(((java.lang.String)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v9).serializable();
    Object v13 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v14 = ((org.mockito.internal.creation.MockSettingsImpl)v12).defaultAnswer(((org.mockito.stubbing.Answer)v13));
    Object v15 = new java.lang.Class[]{null,null};
    Object v16 = ((org.mockito.internal.creation.MockSettingsImpl)v12).extraInterfaces(((java.lang.Class[])v15));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).name(((java.lang.String)v5));
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v5).serializable();
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = "";
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v7).name(((java.lang.String)v8));
    Object v10 = ((org.mockito.internal.creation.MockSettingsImpl)v9).serializable();
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v6).spiedInstance(((java.lang.Object)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v6).getSpiedInstance();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = "\n-";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).defaultAnswer(((org.mockito.stubbing.Answer)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = "\n-";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = "Verification in order failure";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).name(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v5).serializable();
    Object v7 = new java.lang.Class[]{null};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = new java.lang.Class[]{null};
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v5).extraInterfaces(((java.lang.Class[])v6));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = "";
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).name(((java.lang.String)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v9).serializable();
    Object v13 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v14 = ((org.mockito.internal.creation.MockSettingsImpl)v12).defaultAnswer(((org.mockito.stubbing.Answer)v13));
    Object v15 = ((org.mockito.internal.creation.MockSettingsImpl)v12).serializable();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = ((org.mockito.internal.creation.MockSettingsImpl)v9).getSpiedInstance();
    Object v11 = new java.lang.Class[]{null};
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v10).extraInterfaces(((java.lang.Class[])v11));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = "";
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v5).name(((java.lang.String)v6));
    Object v8 = new java.lang.Class[]{null,null,null};
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v7).extraInterfaces(((java.lang.Class[])v8));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v10 = ((org.mockito.internal.creation.MockSettingsImpl)v8).defaultAnswer(((org.mockito.stubbing.Answer)v9));
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v8).getExtraInterfaces();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).defaultAnswer(((org.mockito.stubbing.Answer)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).name(((java.lang.String)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).getDefaultAnswer();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = new java.lang.Class[]{};
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v5).extraInterfaces(((java.lang.Class[])v6));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = "";
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).name(((java.lang.String)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v9).serializable();
    Object v13 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v14 = ((org.mockito.internal.creation.MockSettingsImpl)v12).defaultAnswer(((org.mockito.stubbing.Answer)v13));
    Object v15 = ((org.mockito.internal.creation.MockSettingsImpl)v12).serializable();
    Object v16 = new java.lang.Class[]{null,null};
    Object v17 = ((org.mockito.internal.creation.MockSettingsImpl)v15).extraInterfaces(((java.lang.Class[])v16));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v5).serializable();
    Object v7 = new java.lang.Class[]{null,null};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ",Y ";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v4).serializable();
    Object v6 = "";
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v5).name(((java.lang.String)v6));
    Object v8 = new java.lang.Class[]{};
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v7).extraInterfaces(((java.lang.Class[])v8));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v4 = "";
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).name(((java.lang.String)v4));
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v5));
    Object v7 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).defaultAnswer(((org.mockito.stubbing.Answer)v7));
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v10 = "";
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).name(((java.lang.String)v10));
    Object v12 = ((org.mockito.internal.creation.MockSettingsImpl)v9).serializable();
    Object v13 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v14 = ((org.mockito.internal.creation.MockSettingsImpl)v12).defaultAnswer(((org.mockito.stubbing.Answer)v13));
    Object v15 = ((org.mockito.internal.creation.MockSettingsImpl)v14).isSerializable();
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = "\n-";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = "Verification in order failure";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).name(((java.lang.String)v5));
    Object v7 = new java.lang.Class[]{};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v6));
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v7).isSerializable();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = "\n-";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = "Verification in order failure";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).name(((java.lang.String)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).isSerializable();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = "\n-";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = new java.lang.Class[]{null,null};
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).extraInterfaces(((java.lang.Class[])v5));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = "\n-";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).defaultAnswer(((org.mockito.stubbing.Answer)v5));
    Object v7 = new java.lang.Class[]{null,null,null};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = "\n-";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).defaultAnswer(((org.mockito.stubbing.Answer)v5));
    Object v7 = new java.lang.Class[]{};
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v4));
    Object v6 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v3).defaultAnswer(((org.mockito.stubbing.Answer)v6));
    Object v8 = ((org.mockito.internal.creation.MockSettingsImpl)v7).getMockName();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = "\n-";
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v3));
    Object v5 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v4).defaultAnswer(((org.mockito.stubbing.Answer)v5));
    Object v7 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v8 = "";
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v7).name(((java.lang.String)v8));
    Object v10 = ",Y ";
    Object v11 = ((org.mockito.internal.creation.MockSettingsImpl)v9).name(((java.lang.String)v10));
    Object v12 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v13 = ((org.mockito.internal.creation.MockSettingsImpl)v11).defaultAnswer(((org.mockito.stubbing.Answer)v12));
    Object v14 = ((org.mockito.internal.creation.MockSettingsImpl)v6).spiedInstance(((java.lang.Object)v13));
    Object v15 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v16 = "";
    Object v17 = ((org.mockito.internal.creation.MockSettingsImpl)v15).name(((java.lang.String)v16));
    Object v18 = "\n-";
    Object v19 = ((org.mockito.internal.creation.MockSettingsImpl)v17).name(((java.lang.String)v18));
    Object v20 = "Verification in order failure";
    Object v21 = ((org.mockito.internal.creation.MockSettingsImpl)v19).name(((java.lang.String)v20));
    Object v22 = ((org.mockito.internal.creation.MockSettingsImpl)v21).isSerializable();
    Object v23 = ((org.mockito.internal.creation.MockSettingsImpl)v6).spiedInstance(((java.lang.Object)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = ((org.mockito.internal.creation.MockSettingsImpl)v2).serializable();
    Object v4 = new java.lang.Class[]{};
    Object v5 = ((org.mockito.internal.creation.MockSettingsImpl)v3).extraInterfaces(((java.lang.Class[])v4));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.creation.MockSettingsImpl();
    Object v1 = "";
    Object v2 = ((org.mockito.internal.creation.MockSettingsImpl)v0).name(((java.lang.String)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = ((org.mockito.internal.creation.MockSettingsImpl)v2).spiedInstance(((java.lang.Object)v3));
    Object v5 = "Verification in order failure";
    Object v6 = ((org.mockito.internal.creation.MockSettingsImpl)v2).name(((java.lang.String)v5));
    Object v7 = ((org.mockito.internal.creation.MockSettingsImpl)v6).serializable();
    Object v8 = new java.lang.Class[]{null};
    Object v9 = ((org.mockito.internal.creation.MockSettingsImpl)v6).extraInterfaces(((java.lang.Class[])v8));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }
}
