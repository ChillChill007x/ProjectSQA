package org.apache.commons.math.distribution;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -9.201062957624352D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = Double.NaN;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = 18.129466414543938D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getDomainUpperBound((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.7976931348623157E308D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getDomainLowerBound((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = -5.600479267601105D;
    Object v7 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -19.25307813025634D;
    Object v4 = -2.0313823557084816D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -3.1203726879327043D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0478953131043394D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 36.63640876740301D;
    Object v4 = 35.12059176396606D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 36.42799776884428D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = 27.678586811820857D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 22.08442666421565D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 26.36257175233623D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = 9.041992858490703D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 60.44833720950099D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.5061906376881709D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -31.903011827881166D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getDomainUpperBound((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.7976931348623157E308D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 27.4810015575928D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = 22.280684253220926D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -17.78028118068242D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.6409813594841176D;
    Object v4 = 51.915641048949986D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.4334739209932208D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -3.9143335263426753D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = 2.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = 0.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 27.488215347518196D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = -16.729704745791736D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 52.51630253764957D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4.0995880682266534D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -1.7758884814639742D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getNumeratorDegreesOfFreedom();
    org.junit.Assert.assertEquals((Object)(7.186504528282813D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -40.99494266484885D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.3497847261269885D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 30.95595645121545D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 2.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = 14.916034641489244D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 14.822798244338037D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -3.9520529828088504D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = -1.930616628969136D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 24.673473701557846D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getDomainLowerBound((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -12.902463090055681D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 13.54093144243492D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 16.34383474252304D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 43.75773933543401D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 25.694399076729283D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 39.77232712146002D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.8807735288911642D;
    Object v4 = 4.867027465587952D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = -22.90904823842712D;
    Object v7 = 1.0D;
    Object v8 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.3497847261269885D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -18.397214566025255D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -8.726815567997496D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -35.23636452216762D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 37.23780296693809D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -28.49181280400925D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 30.511216049912104D;
    Object v4 = -10.137931847765278D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 5.624249160913587D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = -23.34863808930069D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -4.240557538845608D;
    Object v4 = ((org.apache.commons.math.distribution.Distribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = -11.978345558524232D;
    Object v7 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -53.73887221416754D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getDenominatorDegreesOfFreedom();
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.3497847261269885D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 30.1682746918158D;
    Object v7 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.8605617290778343D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 50.97514037224551D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.8924558663601774D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 9.799066493356914D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = -2.447018882955848D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -4.823230760588268D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -3.700093880146082D;
    Object v4 = 12.859675280056347D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.7882072849523041D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 17.561625539387936D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.81805777658382D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -0.16059210769870427D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -20.405660372862428D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 16.311296311594138D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 5.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 15.7677252971834D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = -39.53943815064298D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -3.80380509831088E16D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -9.011192798615264D;
    Object v4 = 0.5D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 46.73049708640726D;
    Object v7 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.8877155744507352D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -18.046562184374178D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 27.724774384864673D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.8546268231908786D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.distribution.Distribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = 3.16635685437617D;
    Object v6 = -11.585071832950971D;
    Object v7 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 21.191760296166027D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = -5.6816782226034865D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 40.36106364429131D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = 2.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 24.198397870722822D;
    Object v4 = 1.2928401565829368D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 26.02506489270568D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = Double.NaN;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = 0.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 2.0794291004443726D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -3.589494482121226D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setNumeratorDegreesOfFreedom((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 2.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4.263083389552916D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.6425665318487376D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -40.42595379520891D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 6.0D;
    Object v4 = ((org.apache.commons.math.distribution.FDistributionImpl)v2).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.FDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 12.58671737228261D;
    ((org.apache.commons.math.distribution.FDistributionImpl)v2).setDenominatorDegreesOfFreedom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }
}
