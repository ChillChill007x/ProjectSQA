package org.apache.commons.math.stat.inference;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[][]{null,null};
    Object v4 = -29.149332491441704D;
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTest(((long[][])v3),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new double[]{0.0D,31.778116563086225D,1.7215537136911236D};
    Object v4 = new long[]{};
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquare(((double[])v3),((long[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new double[]{};
    Object v4 = new long[]{-14L,0L};
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquare(((double[])v3),((long[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).getDistributionFactory();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = 12.264513308387349D;
    Object v4 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v3).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v4));
    Object v5 = null;
    Object v6 = new double[]{-6.656675023456614D};
    Object v7 = new long[]{0L,0L,32L};
    Object v8 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquare(((double[])v6),((long[])v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[][]{};
    Object v4 = -47.69800306935826D;
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTest(((long[][])v3),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new double[]{};
    Object v4 = new long[]{};
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquare(((double[])v3),((long[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new double[]{33.44869174623708D,18.454455821901522D};
    Object v4 = new long[]{};
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTest(((double[])v3),((long[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new double[]{0.0D,-20.717405929079668D};
    Object v4 = new long[]{-20L,1L};
    Object v5 = Double.NaN;
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTest(((double[])v3),((long[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[]{};
    Object v4 = new long[]{-34L,0L};
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTestDataSetsComparison(((long[])v3),((long[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[]{-5L};
    Object v4 = new long[]{};
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareDataSetsComparison(((long[])v3),((long[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = 12.264513308387349D;
    Object v4 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v3).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[][]{null,null,null};
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquare(((long[][])v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = 12.264513308387349D;
    Object v4 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v3).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v4));
    Object v5 = null;
    Object v6 = new long[][]{};
    Object v7 = 41.825104798272164D;
    Object v8 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTest(((long[][])v6),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[]{0L};
    Object v4 = new long[]{-26L};
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTestDataSetsComparison(((long[])v3),((long[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = 12.264513308387349D;
    Object v4 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v3).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v4));
    Object v5 = null;
    Object v6 = new long[][]{null,null};
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquare(((long[][])v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[][]{null,null,null};
    Object v4 = 0.5D;
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTest(((long[][])v3),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new double[]{0.0D,0.0D,-33.76261332781048D};
    Object v4 = new long[]{};
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquare(((double[])v3),((long[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new double[]{};
    Object v4 = new long[]{0L};
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTest(((double[])v3),((long[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[]{0L,16L};
    Object v4 = new long[]{0L};
    Object v5 = -47.199739879057816D;
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTestDataSetsComparison(((long[])v3),((long[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[]{19L,9223372036854775807L,50L};
    Object v4 = new long[]{-24L,4L};
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareDataSetsComparison(((long[])v3),((long[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[]{1L,0L,-38L};
    Object v4 = new long[]{0L};
    Object v5 = -2.5824139685523235D;
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTestDataSetsComparison(((long[])v3),((long[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = 12.264513308387349D;
    Object v4 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v3).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v4));
    Object v5 = null;
    Object v6 = new long[]{36L,0L};
    Object v7 = new long[]{0L};
    Object v8 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTestDataSetsComparison(((long[])v6),((long[])v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[][]{null,null};
    Object v4 = -25.09941913213286D;
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTest(((long[][])v3),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[]{5L};
    Object v4 = new long[]{-32L,0L};
    Object v5 = 24.56620320833055D;
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTestDataSetsComparison(((long[])v3),((long[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new double[]{};
    Object v4 = new long[]{-30L,-43L,1L};
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTest(((double[])v3),((long[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[]{1L,1L};
    Object v4 = new long[]{11L,-37L,0L};
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTestDataSetsComparison(((long[])v3),((long[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new double[]{-20.343653722087947D,5.0D,0.0D};
    Object v6 = new long[]{};
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquare(((double[])v5),((long[])v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new double[]{46.180822495862834D,0.0D};
    Object v4 = new long[]{90L,-36L,0L};
    Object v5 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquare(((double[])v3),((long[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new long[]{2L,1L,21L};
    Object v6 = new long[]{0L,1L,1L};
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareTestDataSetsComparison(((long[])v5),((long[])v6));
    Object v8 = new long[]{0L};
    Object v9 = new long[]{2L};
    Object v10 = -12.3567466773875D;
    Object v11 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareTestDataSetsComparison(((long[])v8),((long[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new long[]{2L,-8L,2L};
    Object v6 = new long[]{1L,3L};
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareDataSetsComparison(((long[])v5),((long[])v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = 12.264513308387349D;
    Object v6 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v5).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v6));
    Object v7 = null;
    Object v8 = new long[]{};
    Object v9 = new long[]{1L};
    Object v10 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareDataSetsComparison(((long[])v8),((long[])v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new long[]{16L,-15L,22L};
    Object v6 = new long[]{0L,32L,50L};
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareDataSetsComparison(((long[])v5),((long[])v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new long[][]{null};
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareTest(((long[][])v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new double[]{40.53887954237718D,2.0D,13.274967804335596D};
    Object v6 = new long[]{0L,-9L};
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquare(((double[])v5),((long[])v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = 12.264513308387349D;
    Object v6 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v5).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v6));
    Object v7 = null;
    Object v8 = new long[][]{};
    Object v9 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquare(((long[][])v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = new long[]{-10L};
    Object v4 = new long[]{23L,1L};
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquareTestDataSetsComparison(((long[])v3),((long[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = 12.264513308387349D;
    Object v6 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v5).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v6));
    Object v7 = null;
    Object v8 = new long[]{};
    Object v9 = new long[]{};
    Object v10 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareDataSetsComparison(((long[])v8),((long[])v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new double[]{1.0D,-55.0109839898666D};
    Object v6 = new long[]{89L,1L};
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquare(((double[])v5),((long[])v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new long[]{14L,-17L};
    Object v6 = new long[]{5L,0L};
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareDataSetsComparison(((long[])v5),((long[])v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new double[]{-30.89020554916238D,1.0D};
    Object v6 = new long[]{1L,1L};
    Object v7 = -71.17509986217932D;
    Object v8 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareTest(((double[])v5),((long[])v6),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new double[]{0.0D,1.0D,-31.812661073968492D};
    Object v6 = new long[]{};
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquare(((double[])v5),((long[])v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new long[][]{null,null,null};
    Object v6 = 22.44579792197322D;
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareTest(((long[][])v5),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v3 = 12.264513308387349D;
    Object v4 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v3).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v4));
    Object v5 = null;
    Object v6 = new double[]{};
    Object v7 = new long[]{-13L,19L};
    Object v8 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v2).chiSquare(((double[])v6),((long[])v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[][]{null,null};
    Object v2 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((long[][])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[][]{};
    Object v2 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((long[][])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{0.0D,1.0D};
    Object v2 = new long[]{0L,0L,0L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((double[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[][]{null,null};
    Object v2 = 54.777461518024346D;
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((long[][])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{0L};
    Object v2 = new long[]{6L,0L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareDataSetsComparison(((long[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{-24L,1L};
    Object v2 = new long[]{};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareDataSetsComparison(((long[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{0.0D,-59.32191034664138D};
    Object v2 = new long[]{-31L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((double[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[][]{null,null,null};
    Object v2 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((long[][])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{39L,0L};
    Object v2 = new long[]{-8L,0L,0L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTestDataSetsComparison(((long[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[][]{};
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((long[][])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{};
    Object v2 = new long[]{1008L,-17L,-14L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareDataSetsComparison(((long[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{1.0D};
    Object v2 = new long[]{-24L};
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((double[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{-23.68592637806001D,2.0D};
    Object v2 = new long[]{-7L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((double[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{41L,0L};
    Object v2 = new long[]{-22L,29L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTestDataSetsComparison(((long[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{0.0D,27.05083778937506D};
    Object v2 = new long[]{};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((double[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{23.577187648142015D};
    Object v2 = new long[]{1L};
    Object v3 = 77.03077188453446D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((double[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{46.86083517262437D,1.0D,-25.394115523255877D};
    Object v2 = new long[]{0L};
    Object v3 = -55.433614582805916D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((double[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{0L,16L,1L};
    Object v2 = new long[]{};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTestDataSetsComparison(((long[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).getDistributionFactory();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{-40L};
    Object v2 = new long[]{0L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareDataSetsComparison(((long[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{6.572216246456455D,28.939258178751487D,-21.956850883129427D};
    Object v2 = new long[]{-48L,2L,1L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((double[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{28.00222952224084D};
    Object v2 = new long[]{1L,0L};
    Object v3 = -6.133678973398377D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((double[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{};
    Object v2 = new long[]{58L,0L,0L};
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTestDataSetsComparison(((long[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = 12.264513308387349D;
    Object v2 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v1).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v2));
    Object v3 = null;
    Object v4 = new long[]{21L,1L,27L};
    Object v5 = new long[]{0L,0L};
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareDataSetsComparison(((long[])v4),((long[])v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = 12.264513308387349D;
    Object v2 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v1).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v2));
    Object v3 = null;
    Object v4 = new long[]{3L};
    Object v5 = new long[]{};
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareDataSetsComparison(((long[])v4),((long[])v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{71L};
    Object v2 = new long[]{0L,1L,36L};
    Object v3 = 0.696107051865973D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTestDataSetsComparison(((long[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = 12.264513308387349D;
    Object v2 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v1).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v2));
    Object v3 = null;
    Object v4 = new double[]{31.374450267006242D,-25.061236373198724D,Double.NaN};
    Object v5 = new long[]{12L};
    Object v6 = 29.826572290521053D;
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((double[])v4),((long[])v5),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{-77.3577560178913D,-26.792265016345073D};
    Object v2 = new long[]{-2L};
    Object v3 = -29.63715786110081D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((double[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{-58.783301450404146D,35.63952249165655D};
    Object v2 = new long[]{8L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((double[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{};
    Object v2 = new long[]{-7L,0L,0L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((double[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new long[]{};
    Object v6 = new long[]{};
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareDataSetsComparison(((long[])v5),((long[])v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[][]{null};
    Object v2 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((long[][])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{};
    Object v2 = new long[]{0L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareDataSetsComparison(((long[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new long[][]{null,null};
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareTest(((long[][])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{-27.542422489144293D};
    Object v2 = new long[]{21L,-12L,1L};
    Object v3 = 48.63417696619722D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((double[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{0L,1L};
    Object v2 = new long[]{1L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareDataSetsComparison(((long[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = 12.264513308387349D;
    Object v2 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v1).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v2));
    Object v3 = null;
    Object v4 = new double[]{};
    Object v5 = new long[]{-27L,1L,0L};
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((double[])v4),((long[])v5),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = 12.264513308387349D;
    Object v2 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v1).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v2));
    Object v3 = null;
    Object v4 = new long[]{};
    Object v5 = new long[]{0L,44L,-6L};
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTestDataSetsComparison(((long[])v4),((long[])v5),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{};
    Object v2 = new long[]{1L};
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTestDataSetsComparison(((long[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{-8L,7L,3L};
    Object v2 = new long[]{-36L,-62L,2L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareDataSetsComparison(((long[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{27L};
    Object v2 = new long[]{0L};
    Object v3 = 30.343470982611624D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTestDataSetsComparison(((long[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{};
    Object v2 = new long[]{48L,13L,-5L};
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTestDataSetsComparison(((long[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[][]{null,null};
    Object v2 = 2.0D;
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((long[][])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = 12.264513308387349D;
    Object v2 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v1).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v2));
    Object v3 = null;
    Object v4 = new long[][]{};
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((long[][])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{};
    Object v2 = new long[]{};
    Object v3 = 42.919700446665686D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((double[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = 12.264513308387349D;
    Object v2 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v1).doubleValue()));
    ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).setDistribution(((org.apache.commons.math.distribution.ChiSquaredDistribution)v2));
    Object v3 = null;
    Object v4 = new double[]{0.0D,0.0D};
    Object v5 = new long[]{1L,4L,-11L};
    Object v6 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((double[])v4),((long[])v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[][]{null,null,null};
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((long[][])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new long[][]{null};
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareTest(((long[][])v5),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{-17.653998836134452D};
    Object v2 = new long[]{0L,0L,0L};
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquare(((double[])v1),((long[])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[][]{null};
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((long[][])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new double[]{-3.1468917584887013D,1.0D};
    Object v2 = new long[]{};
    Object v3 = 24.80845909311887D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTest(((double[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 12.264513308387349D;
    Object v1 = new org.apache.commons.math.distribution.ChiSquaredDistributionImpl((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    ((org.apache.commons.math.distribution.ChiSquaredDistribution)v1).setDegreesOfFreedom((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl(((org.apache.commons.math.distribution.ChiSquaredDistribution)v1));
    Object v5 = new long[]{1L,7L,0L};
    Object v6 = new long[]{9L,0L,0L};
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v4).chiSquareTestDataSetsComparison(((long[])v5),((long[])v6),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.inference.ChiSquareTestImpl();
    Object v1 = new long[]{15L,-2L,-1L};
    Object v2 = new long[]{0L};
    Object v3 = 37.77154416234028D;
    Object v4 = ((org.apache.commons.math.stat.inference.ChiSquareTestImpl)v0).chiSquareTestDataSetsComparison(((long[])v1),((long[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
