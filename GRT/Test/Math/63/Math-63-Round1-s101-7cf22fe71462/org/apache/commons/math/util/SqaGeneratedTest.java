package org.apache.commons.math.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 30L;
    Object v1 = 11L;
    Object v2 = org.apache.commons.math.util.MathUtils.pow((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(17714700000000000L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1L;
    Object v1 = 24L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-23L), v2);
  }
}
