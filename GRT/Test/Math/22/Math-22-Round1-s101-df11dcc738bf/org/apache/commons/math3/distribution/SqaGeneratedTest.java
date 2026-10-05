package org.apache.commons.math3.distribution;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).getNumeratorDegreesOfFreedom();
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.RealDistribution)v3).getSupportLowerBound();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 26.82318643773622D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).probability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.9646820301199618D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 15.832337001738324D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -41L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).reseedRandomGenerator((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.distribution.FDistribution)v3).getNumericalMean();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).sample((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).calculateNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -2.380797605724765D;
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v3).cumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).probability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -33;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).sample((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v3).cumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).getNumericalMean();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 21.25324477250766D;
    Object v2 = 31.88463531843028D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 14.833322024552803D;
    Object v2 = 1.0D;
    Object v3 = 19.89390251622082D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math3.distribution.FDistribution)v4).cumulativeProbability((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).isSupportUpperBoundInclusive();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = 25.130266116704853D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).reseedRandomGenerator((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 35.44159949019356D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 21.25324477250766D;
    Object v2 = 31.88463531843028D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(0.19644884974026008D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).sample((((java.lang.Integer)v4).intValue()));
    Object v6 = -39.88176782331868D;
    Object v7 = ((org.apache.commons.math3.distribution.FDistribution)v3).cumulativeProbability((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 0.0D;
    Object v2 = 4.0799000049917105D;
    Object v3 = -23.6188987173421D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 21.25324477250766D;
    Object v2 = 31.88463531843028D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).getDenominatorDegreesOfFreedom();
    org.junit.Assert.assertEquals((Object)(2.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 24.405815697770475D;
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).cumulativeProbability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -5.7530664462806875D;
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v3).density((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).isSupportConnected();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -33.92352760034837D;
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v3).density((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 7.505651687389486D;
    Object v1 = -20.908944801752902D;
    Object v2 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 14.833322024552803D;
    Object v2 = 1.0D;
    Object v3 = 19.89390251622082D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.RealDistribution)v4).getNumericalMean();
    Object v6 = -9;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 27.488215347518196D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -16.729704745791736D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).getNumericalVariance();
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v3).getSolverAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -69.58892975492317D;
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v3).cumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = Double.NaN;
    Object v5 = 2.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).probability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 14.833322024552803D;
    Object v2 = 1.0D;
    Object v3 = 19.89390251622082D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).calculateNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).getSupportUpperBound();
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).getNumericalMean();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).cumulativeProbability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.distribution.FDistribution)v3).isSupportLowerBoundInclusive();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -7.210802509736783D;
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v3).cumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -10.607716053108561D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).getSolverAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 2.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).probability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.distribution.FDistribution)v3).isSupportUpperBoundInclusive();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 2;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).sample((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 23L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).reseedRandomGenerator((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.distribution.FDistribution)v3).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 13L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).reseedRandomGenerator((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).probability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).reseedRandomGenerator((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.distribution.FDistribution)v3).calculateNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.RealDistribution)v4).isSupportLowerBoundInclusive();
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 8.747137345583413D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 8.904105325922064D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 0.5469504317089565D;
    Object v1 = -28.49181280400925D;
    Object v2 = 27.511216049912104D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -10;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).sample((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 14.833322024552803D;
    Object v2 = 1.0D;
    Object v3 = 19.89390251622082D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).getNumericalVariance();
    Object v6 = ((org.apache.commons.math3.distribution.FDistribution)v4).calculateNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.RealDistribution)v3).isSupportLowerBoundInclusive();
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 7L;
    ((org.apache.commons.math3.random.RandomGenerator)v0).setSeed((((java.lang.Long)v1).longValue()));
    Object v2 = null;
    Object v3 = 1.0D;
    Object v4 = 0.0D;
    Object v5 = 1.0D;
    Object v6 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 2L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).reseedRandomGenerator((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.distribution.FDistribution)v3).getNumericalMean();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -29.88175373438854D;
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v3).cumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -10.54304518043821D;
    Object v2 = -6.727756438216798D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = -56.15477250922633D;
    Object v2 = -56.709121616067364D;
    Object v3 = 16.256162386905338D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -16;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 14.833322024552803D;
    Object v2 = 1.0D;
    Object v3 = 19.89390251622082D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).getNumericalMean();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -7.537065237372207D;
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.5D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -11.255056240348356D;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 0.0D;
    Object v2 = 22.834699803501415D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -8.850735202686085D;
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.34146985472277425D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 3.0D;
    Object v5 = -22.412448200661924D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).cumulativeProbability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 9.712356850018192D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.41360272399070064D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = 2.0D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math3.distribution.FDistribution)v4).calculateNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).getSupportUpperBound();
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 0L;
    ((org.apache.commons.math3.random.RandomGenerator)v0).setSeed((((java.lang.Long)v1).longValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = 0.15198679767195467D;
    Object v6 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).reseedRandomGenerator((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math3.distribution.FDistribution)v4).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 0.0D;
    Object v2 = -33.72641095567191D;
    Object v3 = 44.74963687749413D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).calculateNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).getNumericalMean();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 31;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.RealDistribution)v4).isSupportLowerBoundInclusive();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.FDistribution)v4).cumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.FDistribution)v3).isSupportLowerBoundInclusive();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.RealDistribution)v3).isSupportConnected();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 14.833322024552803D;
    Object v2 = 1.0D;
    Object v3 = 19.89390251622082D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -30;
    Object v5 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).sample((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 0.0D;
    Object v2 = 36.32403303908154D;
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well44497a();
    Object v1 = 9.754798909885519D;
    Object v2 = 1.0D;
    Object v3 = 27.12016036330641D;
    Object v4 = new org.apache.commons.math3.distribution.FDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.FDistribution)v4).getSupportLowerBound();
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -39.200370327547404D;
    Object v5 = -7.785625833760516D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).probability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.distribution.RealDistribution)v3).getNumericalVariance();
    Object v5 = 1;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).sample((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.FDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).cumulativeProbability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.distribution.FDistribution)v3).calculateNumericalVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }
}
