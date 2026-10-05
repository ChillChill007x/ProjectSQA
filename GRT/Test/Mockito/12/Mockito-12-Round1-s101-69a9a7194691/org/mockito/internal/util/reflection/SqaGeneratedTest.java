package org.mockito.internal.util.reflection;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.util.reflection.GenericMaster();
    Object v1 = null;
    Object v2 = ((org.mockito.internal.util.reflection.GenericMaster)v0).getGenericType(((java.lang.reflect.Field)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.mockito.internal.util.reflection.GenericMaster();
    org.junit.Assert.assertNotNull(v0);
  }
}
