package org.apache.commons.math.stat.descriptive;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getStandardDeviation();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSumsqImpl();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    Object v4 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0),((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = -63.178492753712945D;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).addValue((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getMaxImpl();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).toString();
    Object v7 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v8 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7).getMaxImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).setSumsqImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = -1.0734654383117512D;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).addValue((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMaxImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setGeoMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getVarianceImpl();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v7 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).copy();
    Object v8 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).setMinImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v8));
    Object v9 = null;
    Object v10 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getStandardDeviation();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getGeoMeanImpl();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5),((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getMin();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getMin();
    Object v7 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v8 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v9 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v8).copy();
    Object v10 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v8).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v10));
    Object v11 = null;
    Object v12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7));
    Object v13 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = 1.0D;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).addValue((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getGeometricMean();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).toString();
    Object v7 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v8 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7).getMaxImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getSumsq();
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getSumsq();
    Object v7 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getSecondMoment();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getSummary();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).clear();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).toString();
    org.junit.Assert.assertEquals((Object)("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: 0.0\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getMean();
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getPopulationVariance();
    Object v7 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v8 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v9 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v8).copy();
    Object v10 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v8).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v10));
    Object v11 = null;
    Object v12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7));
    Object v13 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v12).getMin();
    org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5),((org.apache.commons.math.stat.descriptive.SummaryStatistics)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v7 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).getMaxImpl();
    Object v8 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).equals(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(-13536993), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v7 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v8 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7).copy();
    Object v9 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v9));
    Object v10 = null;
    Object v11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6));
    org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5),((org.apache.commons.math.stat.descriptive.SummaryStatistics)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getStandardDeviation();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v7 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v8 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7).copy();
    Object v9 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v9));
    Object v10 = null;
    Object v11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6));
    Object v12 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v13 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v12).copy();
    Object v14 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v12).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v11).setMinImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v11).getStandardDeviation();
    Object v17 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getN();
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).copy();
    Object v4 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v4));
    Object v5 = null;
    Object v6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1));
    Object v7 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).getGeoMeanImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setSumsqImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getVariance();
    Object v7 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getMeanImpl();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getGeometricMean();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).getMaxImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).setGeoMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getVarianceImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setSumImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).clear();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getMinImpl();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v6 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v7 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v8 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7).getMaxImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).setGeoMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v8));
    Object v9 = null;
    Object v10 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).getVarianceImpl();
    Object v11 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSum();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getPopulationVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).clear();
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMinImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).clear();
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMinImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMaxImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getMin();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getPopulationVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(-1170640609), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSummary();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = 1.0D;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).addValue((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).clear();
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMinImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    Object v6 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v7 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v8 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v7).getMaxImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).setGeoMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v8));
    Object v9 = null;
    Object v10 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).getVarianceImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).setGeoMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSumOfLogs();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).hashCode();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSumLogImpl();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).hashCode();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumLogImpl();
    Object v4 = new double[]{};
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.descriptive.UnivariateStatistic)v3).evaluate(((double[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getVariance();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSumImpl();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getPopulationVariance();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getMax();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setSumsqImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSumLogImpl();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSecondMoment();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSumImpl();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).clear();
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMinImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).getVarianceImpl();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getStandardDeviation();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v2 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).copy();
    Object v4 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).setSumsqImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v4));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumLogImpl();
    Object v7 = ((org.apache.commons.math.stat.descriptive.UnivariateStatistic)v6).copy();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setSumLogImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0),((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = 3.493450097482484D;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).addValue((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getStandardDeviation();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setSumImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v2));
    Object v3 = null;
    Object v4 = -16.71851002936018D;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).addValue((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = 0.0D;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).addValue((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSumsqImpl();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setVarianceImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    Object v2 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v3 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v4 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v3).getMaxImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).setGeoMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v4));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).getVarianceImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).setSumLogImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getMaxImpl();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).hashCode();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumLogImpl();
    Object v4 = ((org.apache.commons.math.stat.descriptive.UnivariateStatistic)v3).copy();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMinImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getGeoMeanImpl();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).getSumsqImpl();
    Object v4 = 56.70331509744498D;
    ((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3).increment((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMean();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMinImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMean();
    Object v3 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v4 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v4).copy();
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v4).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v3).setSumsqImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v3).getSumLogImpl();
    Object v9 = ((org.apache.commons.math.stat.descriptive.UnivariateStatistic)v8).copy();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).setMaxImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSum();
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSumsq();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).hashCode();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumLogImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMaxImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).hashCode();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getN();
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getSumImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getPopulationVariance();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getVarianceImpl();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).toString();
    org.junit.Assert.assertEquals((Object)("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: 0.0\nstandard deviation: NaN\nsum of logs: 0.0\n"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).clear();
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMinImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    Object v6 = 1.0D;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).addValue((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    Object v2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).getSumOfLogs();
    org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1),((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).getSumsqImpl();
    Object v4 = new double[]{3.0D};
    ((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3).incrementAll(((double[])v4));
    Object v5 = null;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).setMaxImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getStandardDeviation();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).toString();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getStandardDeviation();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = 0.0D;
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).addValue((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).clear();
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMinImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).copy();
    Object v6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v7 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v6).getGeoMeanImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v5).setMaxImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).clear();
    Object v2 = null;
    Object v3 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v4 = new org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics();
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v4).copy();
    Object v6 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v4).getSumsqImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v3).setSumsqImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v3).getSumLogImpl();
    Object v9 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v3 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v2).getVarianceImpl();
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).setMeanImpl(((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMin();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getGeometricMean();
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getSumOfLogs();
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    Object v2 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).getMinImpl();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0).getMean();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
    Object v1 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(((org.apache.commons.math.stat.descriptive.SummaryStatistics)v0));
    ((org.apache.commons.math.stat.descriptive.SummaryStatistics)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }
}
