package org.apache.commons.math3.random;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 1;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 0;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(752916846), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -53;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).clear();
    Object v2 = null;
    Object v3 = new int[]{};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 50L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = -14;
    Object v5 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 43;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{2};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextLong();
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -9;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(1470540), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBoolean();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextGaussian();
    org.junit.Assert.assertEquals((Object)(0.2478736222527921D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -39;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextGaussian();
    Object v3 = new byte[]{Byte.valueOf((byte)-106)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 0;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 6L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 31L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)110)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 0L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -39;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(5882162), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{-42};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt();
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBoolean();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)110),Byte.valueOf((byte)-103)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    Object v4 = new byte[]{Byte.valueOf((byte)-84),Byte.valueOf((byte)69),Byte.valueOf((byte)-78)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 33;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)110),Byte.valueOf((byte)-103)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    Object v4 = 0;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextLong();
    org.junit.Assert.assertEquals((Object)(3233753233997579692L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 24;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(2941081), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -4;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{0,1,-29};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    Object v4 = 1L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)110),Byte.valueOf((byte)-103),Byte.valueOf((byte)-32)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    Object v4 = 9;
    Object v5 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(455), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -7;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextLong();
    Object v3 = 0L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 11L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)110),Byte.valueOf((byte)-103)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{-22};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{21,1,-5};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 0;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -21L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextFloat();
    org.junit.Assert.assertEquals((Object)(0.17530203F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{-14};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{-1,2,16};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 0L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = new int[]{-57,2,-2};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 14;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(2872), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)110)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    Object v4 = 18;
    Object v5 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(233161), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -16;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextDouble();
    Object v3 = new int[]{-66,-61};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{1,44,-27};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt();
    org.junit.Assert.assertEquals((Object)(752916846), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 1;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextDouble();
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-598879868), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextGaussian();
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextGaussian();
    org.junit.Assert.assertEquals((Object)(0.4887708362197951D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 21;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 57;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(5882162), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).clear();
    Object v2 = null;
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)110),Byte.valueOf((byte)-103),Byte.valueOf((byte)-32)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBoolean();
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextDouble();
    org.junit.Assert.assertEquals((Object)(0.8894389697993161D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 21L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 22L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 1L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextFloat();
    org.junit.Assert.assertEquals((Object)(0.07277703F), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    Object v4 = new byte[]{};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 18;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(45954), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -2;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{3};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{8};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)110),Byte.valueOf((byte)-103)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextFloat();
    org.junit.Assert.assertEquals((Object)(0.88943887F), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    Object v4 = 0;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -33;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 5;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextGaussian();
    org.junit.Assert.assertEquals((Object)(1.5406011899523415D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 1;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
    Object v4 = 69;
    Object v5 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(28), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)110),Byte.valueOf((byte)-103),Byte.valueOf((byte)-32)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    Object v4 = -12;
    Object v5 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 10;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{0,-23,-21};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    Object v4 = 1;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{1,0,-6};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).clear();
    Object v2 = null;
    Object v3 = new int[]{0,0,0};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 1L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{2,0};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 26;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = 0;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBoolean();
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-474856020), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -55L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -14;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 8L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextGaussian();
    org.junit.Assert.assertEquals((Object)(0.07378171255992552D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 17;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextFloat();
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextGaussian();
    org.junit.Assert.assertEquals((Object)(1.5406011899523415D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).clear();
    Object v2 = null;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextGaussian();
    org.junit.Assert.assertEquals((Object)(0.2478736222527921D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 2;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextLong();
    Object v3 = 1;
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 20;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -26;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -23;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).next((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(89), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -3L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new int[]{54,0,49};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed(((int[])v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextGaussian();
    org.junit.Assert.assertEquals((Object)(-1.371723650842802D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -15;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -24;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 82L;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)110)};
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBytes(((byte[])v2));
    Object v3 = null;
    Object v4 = 0;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = -3;
    ((org.apache.commons.math3.random.BitsStreamGenerator)v1).setSeed((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextGaussian();
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextBoolean();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextFloat();
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new org.apache.commons.math3.random.Well19937c(((int[])v0));
    Object v2 = 16;
    Object v3 = ((org.apache.commons.math3.random.BitsStreamGenerator)v1).nextInt((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v3);
  }
}
