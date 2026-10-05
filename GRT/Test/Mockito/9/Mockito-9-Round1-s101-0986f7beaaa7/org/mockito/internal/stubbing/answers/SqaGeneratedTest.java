package org.mockito.internal.stubbing.answers;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    Object v1 = null;
    Object v2 = ((org.mockito.internal.stubbing.answers.CallsRealMethods)v0).answer(((org.mockito.invocation.InvocationOnMock)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.mockito.internal.stubbing.answers.CallsRealMethods();
    org.junit.Assert.assertNotNull(v0);
  }
}
