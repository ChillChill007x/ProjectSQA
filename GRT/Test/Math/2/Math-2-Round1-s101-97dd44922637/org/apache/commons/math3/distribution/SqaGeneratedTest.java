package org.apache.commons.math3.distribution;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).cumulativeProbability((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0.9996019133144861D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -43;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 21;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -17.175123657776325D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.RandomGenerator)v1).nextBoolean();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 39;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).probability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).probability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 10;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).upperCumulativeProbability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.IntegerDistribution)v3).getNumericalMean();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -42L;
    ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).reseedRandomGenerator((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = 25;
    Object v7 = 0;
    Object v8 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).cumulativeProbability((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = ((org.apache.commons.math3.random.RandomGenerator)v1).nextFloat();
    Object v3 = 2;
    Object v4 = 23;
    Object v5 = -8;
    Object v6 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()));
    Object v6 = 58;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).probability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -76;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 10.696062562706038D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 4;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).getNumberOfSuccesses();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = -23;
    Object v4 = 24;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = -5;
    Object v3 = 35;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).sample();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).upperCumulativeProbability((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(39), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -20;
    Object v5 = 10;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -24;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).upperCumulativeProbability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).getSupportLowerBound();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 15;
    Object v6 = ((org.apache.commons.math3.distribution.IntegerDistribution)v4).probability((((java.lang.Integer)v5).intValue()));
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).calculateNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).upperCumulativeProbability((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).getNumericalMean();
    org.junit.Assert.assertEquals((Object)(0.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).upperCumulativeProbability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).getSampleSize();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).cumulativeProbability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).isSupportConnected();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -13;
    Object v7 = 1;
    Object v8 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v5).cumulativeProbability((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).upperCumulativeProbability((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = 10;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).getNumericalVariance();
    Object v5 = 2;
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).upperCumulativeProbability((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 36;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).upperCumulativeProbability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).getSupportUpperBound();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 2;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).calculateNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -35;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).cumulativeProbability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).cumulativeProbability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -10;
    Object v7 = -43;
    Object v8 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v5).cumulativeProbability((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 11;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).probability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).calculateNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -61;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 44;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = -28;
    Object v4 = 27;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -10;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).sample((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).upperCumulativeProbability((((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).cumulativeProbability((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).probability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = -6L;
    ((org.apache.commons.math3.random.RandomGenerator)v1).setSeed((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).isSupportConnected();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v5).cumulativeProbability((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).upperCumulativeProbability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.IntegerDistribution)v4).isSupportConnected();
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -50;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).probability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).upperCumulativeProbability((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = -6;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 11;
    Object v3 = 1;
    Object v4 = 26;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).getSampleSize();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 42;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
    Object v7 = 1L;
    ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).reseedRandomGenerator((((java.lang.Long)v7).longValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 2;
    Object v3 = -48;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 2;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -35;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).probability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).probability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = -47;
    Object v1 = -4;
    Object v2 = -2;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).upperCumulativeProbability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -46;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).cumulativeProbability((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.IntegerDistribution)v4).getNumericalVariance();
    Object v6 = -11.211293337401894D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).sample();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).probability((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 0;
    Object v3 = 7;
    Object v4 = 44;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 32;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).cumulativeProbability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 33;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 0;
    Object v3 = -20;
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1L;
    ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).reseedRandomGenerator((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = 29;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = 2;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 35;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -40;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).upperCumulativeProbability((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 3;
    Object v5 = 27;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).cumulativeProbability((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -18L;
    ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).reseedRandomGenerator((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -7.836884005847358D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 61;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).sample((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).sample((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -31;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 39;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).getSampleSize();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 2;
    Object v5 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).probability((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1;
    Object v6 = 8;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).cumulativeProbability((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(3.980866617114831E-4D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v3).getNumericalMean();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.distribution.HypergeometricDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math3.distribution.HypergeometricDistribution)v5).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new int[]{31};
    Object v1 = new org.apache.commons.math3.random.Well512a(((int[])v0));
    Object v2 = 39;
    Object v3 = 11.309308709601185D;
    Object v4 = new org.apache.commons.math3.distribution.ZipfDistribution(((org.apache.commons.math3.random.RandomGenerator)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 18.868827188710146D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractIntegerDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }
}
