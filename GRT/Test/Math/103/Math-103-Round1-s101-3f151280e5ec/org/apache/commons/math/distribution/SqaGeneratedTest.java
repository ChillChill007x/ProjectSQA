package org.apache.commons.math.distribution;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -29.403505977102817D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setMean((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -17.572472436023293D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -22.881760641705927D;
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 23.368604282691546D;
    Object v6 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.1586552539314643D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 1.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 13.10028217218288D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainUpperBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.7976931348623157E308D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = 5.037973005709474D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.4999997647561114D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -16.258640241123967D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-5.551115123125783E-16D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 35.18052173682364D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0000000000000322D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -2.691392976667214D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0035577162143097807D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -19.80256852233491D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainUpperBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setMean((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 42.84387528185432D;
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -57.26655481260994D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = 27.678586811820857D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.9999999999999822D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 22.08442666421565D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 1.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.841344746068543D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NEGATIVE_INFINITY), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.5D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 26.36257175233623D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v2).setMean((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = 9.041992858490703D;
    Object v6 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v2).getDomainUpperBound((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.7976931348623157E308D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.7976931348623157E308D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 2.0D;
    Object v2 = ((org.apache.commons.math.distribution.Distribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 8.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.15865525393145652D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 60.44833720950099D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 27.4810015575928D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 2.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 22.280684253220926D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -17.78028118068242D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(9.492406860545088E-15D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 1.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.6409813594841176D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -17.0255872273428D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.7976931348623157E308D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -40.572168621978555D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = 13.683625027688564D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 47.948586109572275D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 9.142643175441133D;
    Object v2 = -32.8443132101778D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v2).setStandardDeviation((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 1.0D;
    Object v2 = ((org.apache.commons.math.distribution.Distribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 39.38004017301598D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = -28.18265980379726D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setMean((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -85.63033074899917D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.7976931348623157E308D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -24.792968977091732D;
    Object v2 = 12.038093722074144D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 2.0D;
    Object v5 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.9772498680518209D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 5.17856201026643D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getStandardDeviation();
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -24.3271176696025D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-4.218847493575595E-15D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 4.195304735167672D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 14.822798244338037D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -3.9520529828088504D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = -1.930616628969136D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 24.673473701557846D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -12.902463090055681D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v2).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getMean();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 43.54093144243492D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 55.74662791846254D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 29.373813785400262D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 3.0D;
    Object v2 = 11.508708411573878D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0013498980316319908D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setMean((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 1.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math.distribution.Distribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = -8.574703027867708D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -72.52476594651095D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 1.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setMean((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = -55.98789438685358D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 3.4507804447780104D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -22.608688233791256D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -13.623772550923633D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.7976931348623157E308D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainUpperBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v2).setMean((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setMean((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = -61.94390311632415D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 1.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setMean((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainUpperBound((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.7976931348623157E308D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -24.98252504856051D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v2).getDomainLowerBound((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.7976931348623157E308D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 1.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainUpperBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.7976931348623157E308D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 24.38882380061899D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 2.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 46.46560302472234D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 1.8371283130506004D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setMean((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NEGATIVE_INFINITY), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -7.677009866829908D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(9.103828801926284E-15D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 51.61846449303282D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainUpperBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.7976931348623157E308D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v2).getDomainLowerBound((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(7.186504528282813D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.22402414210362775D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 8.452722055187177D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 22.277496082364205D;
    Object v2 = 5.3495290408895775D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 1.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 0.0D;
    Object v2 = 2.0D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.4772498680518209D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 2.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 9.0D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -9.21372107271781D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setMean((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = -11.466663217807517D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainUpperBound((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-9.21372107271781D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 60.01864048695945D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -10.689755394927602D;
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.4999999999999995D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 30.878594326792104D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).inverseCumulativeProbability((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 13.558098655928937D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainUpperBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.7976931348623157E308D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -27.231313973961498D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-7.105427357601002E-15D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 98.25055385008949D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v2).setMean((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = -28.568822873453126D;
    Object v6 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v2).getDomainLowerBound((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.7976931348623157E308D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 65.2015044625002D;
    ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).setStandardDeviation((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainUpperBound((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 7.186504528282813D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.distribution.NormalDistributionImpl((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = -42.273822449331504D;
    Object v5 = ((org.apache.commons.math.distribution.AbstractDistribution)v2).cumulativeProbability((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -0.46146900913846034D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getInitialDomain((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = 2.0D;
    Object v2 = Double.NaN;
    Object v3 = ((org.apache.commons.math.distribution.AbstractDistribution)v0).cumulativeProbability((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    Object v1 = -1.9405412037317007D;
    Object v2 = ((org.apache.commons.math.distribution.NormalDistributionImpl)v0).getDomainLowerBound((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.7976931348623157E308D), v2);
  }
}
