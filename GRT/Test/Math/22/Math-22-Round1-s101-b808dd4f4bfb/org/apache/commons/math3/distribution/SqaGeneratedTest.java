package org.apache.commons.math3.distribution;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = -17.441450201113923D;
    Object v1 = 28.953944845166948D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.UniformRealDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 19.75636778599376D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).probability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 4.0D;
    Object v8 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v3).cumulativeProbability((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.4621460853976004D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = -17.441450201113923D;
    Object v1 = 28.953944845166948D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.UniformRealDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -74.33220487171837D;
    Object v5 = ((org.apache.commons.math3.distribution.RealDistribution)v3).density((((java.lang.Double)v4).doubleValue()));
    Object v6 = 23.44162685961207D;
    Object v7 = -42.925383356201635D;
    Object v8 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).probability((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -17.441450201113923D;
    Object v1 = 28.953944845166948D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.UniformRealDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v3).cumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.39748449566423555D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -17.441450201113923D;
    Object v1 = 28.953944845166948D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.UniformRealDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 22L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v3).reseedRandomGenerator((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v3).density((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.02155386324445494D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -4.317231722165737D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).cumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.6919090004845334D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.RealDistribution)v4).isSupportConnected();
    Object v6 = 34.31473154223536D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-16.258640241123967D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -38;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -2.75963829253681D;
    Object v6 = 2.0D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.21784093300573737D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 36.11552162102064D;
    Object v1 = 27.678586811820857D;
    Object v2 = 22.08442666421565D;
    Object v3 = new org.apache.commons.math3.distribution.UniformRealDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(24.821721914378628D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).reseedRandomGenerator((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.05794199230233651D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.RealDistribution)v4).isSupportLowerBoundInclusive();
    Object v6 = 0.0D;
    Object v7 = -3.7561311138592224D;
    Object v8 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 56;
    Object v2 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextInt((((java.lang.Integer)v1).intValue()));
    Object v3 = 2.0D;
    Object v4 = -28.3206581357427D;
    Object v5 = -51.385395883218735D;
    Object v6 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -31.1943022870341D;
    Object v6 = -22.300849088532516D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).reseedRandomGenerator((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(24.821721914378628D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).sample();
    Object v6 = -76.10804750390423D;
    Object v7 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 10.696062562706038D;
    Object v6 = -13.20338967611464D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 11;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).isSupportConnected();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).isSupportUpperBoundInclusive();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 26.352314118541717D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 53.180621979189034D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(31.91334363234923D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.03234849040896214D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -20.479774120402684D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).getSupportUpperBound();
    org.junit.Assert.assertEquals((Object)(31.91334363234923D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 13L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).reseedRandomGenerator((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 9.607593624504181D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 26;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).getSolverAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(34.18052173682364D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 11.00533613855921D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 13.442183435312966D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.03234849040896214D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).isSupportConnected();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.8892433356860748D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -47;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 19.85948798598467D;
    Object v1 = 1.1288021292919965D;
    Object v2 = new org.apache.commons.math3.distribution.UniformRealDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -5.454412219829374D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).cumulativeProbability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).isSupportLowerBoundInclusive();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 30.333352210135374D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.03234849040896214D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).isSupportUpperBoundInclusive();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).cumulativeProbability((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -59.29586094675024D;
    Object v6 = Double.POSITIVE_INFINITY;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -8.447654957826995D;
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).cumulativeProbability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 22.494996627757928D;
    Object v9 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).cumulativeProbability((((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 25.60783364436268D;
    Object v2 = 1.0D;
    Object v3 = 17.34383474252304D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -17.441450201113923D;
    Object v1 = 28.953944845166948D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math3.distribution.UniformRealDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 24.694399076729283D;
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v3).density((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.02155386324445494D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -16.258640241123967D;
    Object v2 = 1.0D;
    Object v3 = 34.18052173682364D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = 0.8807735288911642D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).cumulativeProbability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.7731643366680563D;
    Object v9 = -26.96832515630248D;
    Object v10 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).cumulativeProbability((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).isSupportConnected();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -16.933715255360177D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.RealDistribution)v4).isSupportConnected();
    Object v6 = 33.40920670626886D;
    Object v7 = 7.859590503766821D;
    Object v8 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextLong();
    Object v2 = -34.23947255322807D;
    Object v3 = 12.172856200542121D;
    Object v4 = -7.0921321758581435D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextLong();
    Object v2 = -34.23947255322807D;
    Object v3 = 12.172856200542121D;
    Object v4 = -7.0921321758581435D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 13.017783820047667D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v5).probability((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).getSupportUpperBound();
    org.junit.Assert.assertEquals((Object)(39.77232712146002D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 28.434410583212664D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).cumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.7149295161024224D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextBoolean();
    Object v2 = 0.0D;
    Object v3 = 2.0D;
    Object v4 = -13.623772550923633D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).probability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextLong();
    Object v2 = -34.23947255322807D;
    Object v3 = 12.172856200542121D;
    Object v4 = -7.0921321758581435D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 2.0D;
    Object v7 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v5).density((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.021545999238807158D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -62.94390311632415D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 57.70331509744498D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).cumulativeProbability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.025143110106333917D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).isSupportLowerBoundInclusive();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 29.094267927171444D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).cumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.7315203819560511D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -24.98252504856051D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).cumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextBoolean();
    Object v2 = 0.0D;
    Object v3 = 2.0D;
    Object v4 = -13.623772550923633D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v5).density((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.5D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).cumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.025143110106333917D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
    Object v1 = 8L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v0).reseedRandomGenerator((((java.lang.Long)v1).longValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v0).getSolverAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-9D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 32.81821548429848D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 2.0D;
    Object v2 = 1.11382324131596D;
    Object v3 = 2.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextLong();
    Object v2 = -34.23947255322807D;
    Object v3 = 12.172856200542121D;
    Object v4 = -7.0921321758581435D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = -22;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v5).sample((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -25.119117008067295D;
    Object v2 = 17.92219895896297D;
    Object v3 = new org.apache.commons.math3.distribution.UniformRealDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).reseedRandomGenerator((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).getNumericalVariance();
    org.junit.Assert.assertEquals((Object)(131.81983372136872D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.025143110106333917D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextBoolean();
    Object v2 = 0.0D;
    Object v3 = 2.0D;
    Object v4 = -13.623772550923633D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v5).isSupportLowerBoundInclusive();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextBoolean();
    Object v2 = 0.0D;
    Object v3 = 2.0D;
    Object v4 = -13.623772550923633D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v5).getNumericalMean();
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -32;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).sample((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 1.0D;
    Object v2 = 31.91334363234923D;
    Object v3 = 21.47081584479693D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
    Object v7 = 4.42628321280994D;
    Object v8 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).cumulativeProbability((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.11083508964797036D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).getNumericalMean();
    org.junit.Assert.assertEquals((Object)(19.88616356073001D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math3.distribution.UniformRealDistribution();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v0).density((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.distribution.UniformRealDistribution((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextLong();
    Object v2 = -34.23947255322807D;
    Object v3 = 12.172856200542121D;
    Object v4 = -7.0921321758581435D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 20.245962393404035D;
    Object v7 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v5).cumulativeProbability((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextLong();
    Object v2 = -34.23947255322807D;
    Object v3 = 12.172856200542121D;
    Object v4 = -7.0921321758581435D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v5).sample((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextBoolean();
    Object v2 = 0.0D;
    Object v3 = 2.0D;
    Object v4 = -13.623772550923633D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.distribution.RealDistribution)v5).isSupportLowerBoundInclusive();
    Object v7 = -21;
    Object v8 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v5).sample((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextBoolean();
    Object v2 = 0.0D;
    Object v3 = 2.0D;
    Object v4 = -13.623772550923633D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 59.69557225722607D;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v5).inverseCumulativeProbability((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -0.10107464852530017D;
    Object v2 = 12.196784275338604D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0.0D;
    Object v2 = 39.77232712146002D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -12.634907689748003D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -0.10107464852530017D;
    Object v2 = 12.196784275338604D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.08131496760460534D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -0.10107464852530017D;
    Object v2 = 12.196784275338604D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -10.059799380123813D;
    Object v6 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextBoolean();
    Object v2 = 0.0D;
    Object v3 = 2.0D;
    Object v4 = -13.623772550923633D;
    Object v5 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 3;
    Object v7 = ((org.apache.commons.math3.distribution.AbstractRealDistribution)v5).sample((((java.lang.Integer)v6).intValue()));
    Object v8 = 2.0D;
    Object v9 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v5).cumulativeProbability((((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 9.844420029413381D;
    Object v2 = 0.0D;
    Object v3 = 6.54005496291336D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -0.10107464852530017D;
    Object v2 = 12.196784275338604D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    ((org.apache.commons.math3.distribution.AbstractRealDistribution)v4).reseedRandomGenerator((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = 0L;
    ((org.apache.commons.math3.random.RandomGenerator)v0).setSeed((((java.lang.Long)v1).longValue()));
    Object v2 = null;
    Object v3 = -12.620676324380964D;
    Object v4 = 1.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.math3.random.Well1024a();
    Object v1 = -0.10107464852530017D;
    Object v2 = 12.196784275338604D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.distribution.UniformRealDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = -88.9170551721677D;
    Object v6 = ((org.apache.commons.math3.distribution.UniformRealDistribution)v4).density((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }
}
