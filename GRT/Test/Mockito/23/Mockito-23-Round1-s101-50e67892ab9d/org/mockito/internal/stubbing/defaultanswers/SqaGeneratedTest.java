package org.mockito.internal.stubbing.defaultanswers;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
    Object v1 = null;
    Object v2 = ((org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs)v0).answer(((org.mockito.invocation.InvocationOnMock)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
    Object v1 = null;
    Object v2 = new org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod(((org.mockito.internal.creation.MockitoMethodProxy)v1));
    Object v3 = ((org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs)v0).actualParameterizedType(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
    Object v1 = null;
    Object v2 = new org.mockito.internal.creation.DelegatingMethod(((java.lang.reflect.Method)v1));
    Object v3 = ((org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs)v0).actualParameterizedType(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
    Object v1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
    Object v2 = ((org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs)v0).actualParameterizedType(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }
}
