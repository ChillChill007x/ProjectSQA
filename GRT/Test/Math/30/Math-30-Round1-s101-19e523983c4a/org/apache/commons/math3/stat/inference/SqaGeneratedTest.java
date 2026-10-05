package org.apache.commons.math3.stat.inference;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{29.67419927060944D,1.0D,16.95981696904689D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{};
    Object v2 = new double[]{-6.19220497251351D,0.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{27.368604282691546D,0.0D,-10.517227601271408D};
    Object v2 = new double[]{1.0D,0.0D,-3.0518911168377927D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
    Object v4 = new double[]{1.0D,1.0D,0.0D};
    Object v5 = new double[]{2.0D,20.25173360343224D,0.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyUTest(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(0.38273308888522584D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{3.6397728814591948D,0.0D,1.0D};
    Object v2 = new double[]{2.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyUTest(((double[])v1),((double[])v2));
    Object v4 = new double[]{0.0D};
    Object v5 = new double[]{50.198474460085386D,-20.56007482731805D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{-56.74364462340591D,1.0D,1.0D};
    Object v2 = new double[]{4.045665134604077D,1.0D,0.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(6.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{1.0D,-52.64539764528078D};
    Object v2 = new double[]{2.0D,-32.23936452470727D,-16.25820525913097D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(4.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{12.509905978943824D,31.401564072077253D};
    Object v2 = new double[]{0.0D,-11.913013995983176D,-42.00406316159773D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(6.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{};
    Object v2 = new double[]{23.59837451457785D,0.5D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{41.67554857559526D,0.0D};
    Object v2 = new double[]{24.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
    Object v4 = new double[]{};
    Object v5 = new double[]{1.0D,0.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{};
    Object v2 = new double[]{2.0D,0.0D,1.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{-20.851791746181416D};
    Object v5 = new double[]{-8.500222355916177D,0.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(2.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{};
    Object v2 = new double[]{1.0D,0.0D,0.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{};
    Object v2 = new double[]{};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{};
    Object v2 = new double[]{8.842533562818952D,56.65580886320719D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{28.078808203196893D,0.0D};
    Object v5 = new double[]{1.0D,1.0D,6.819778100333033D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(3.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{-1.210851531260589D,0.0D,0.0D};
    Object v5 = new double[]{-54.89280441524242D,1.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyUTest(((double[])v4),((double[])v5));
    Object v7 = new double[]{0.0D};
    Object v8 = new double[]{0.0D,0.0D};
    Object v9 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v7),((double[])v8));
    org.junit.Assert.assertEquals((Object)(1.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{1.0D,-19.37452805420237D};
    Object v2 = new double[]{0.0D,2.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
    Object v4 = new double[]{-57.68884021151937D,-7.833949095140632D};
    Object v5 = new double[]{0.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(2.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{};
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{-37.14193633627374D,-4.576418796778344D,2.0D};
    Object v5 = new double[]{10.038093722074144D,0.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(5.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{6.17856201026643D,1.0D,-4.765785059692132D};
    Object v4 = new double[]{0.0D,0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyUTest(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(0.5637028616507731D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{1.0D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{-23.93810982062337D,34.979188106135055D,0.0D};
    Object v5 = new double[]{};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{-2.383811419687738D,1.8616773924345944D,-8.48643928705609D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{-25.09941913213286D,-31.880786511331344D,16.925365688374715D};
    Object v4 = new double[]{9.48233048039232D,0.0D,-33.03350879657651D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyUTest(((double[])v3),((double[])v4));
    Object v6 = new double[]{-2.241388581421979D};
    Object v7 = new double[]{17.005471118771194D,0.0D};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
    org.junit.Assert.assertEquals((Object)(2.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{1.0D};
    Object v4 = new double[]{-60.911733981749705D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyUTest(((double[])v3),((double[])v4));
    Object v6 = new double[]{-12.521392446136796D};
    Object v7 = new double[]{};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{0.0D};
    Object v5 = new double[]{-35.23636452216762D,0.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(1.5D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{38.23780296693809D};
    Object v5 = new double[]{-19.591744877224404D,-95.08783067050099D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
    Object v7 = new double[]{0.0D,22.41532028726412D,-71.83994142779672D};
    Object v8 = new double[]{1.0D};
    Object v9 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v7),((double[])v8));
    org.junit.Assert.assertEquals((Object)(2.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{-34.086562237074304D,1.0D,-57.456596463627406D};
    Object v4 = new double[]{0.0D,-50.6068662174441D,0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(5.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{4.152079546010852D,8.657122178144915D,0.0D};
    Object v5 = new double[]{};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{2.0D};
    Object v2 = new double[]{17.518481098326085D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D};
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    Object v6 = new double[]{8.31748836890985D,0.0D,42.25424921314953D};
    Object v7 = new double[]{-2.447018882955848D,-4.823230760588268D};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
    org.junit.Assert.assertEquals((Object)(6.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{};
    Object v5 = new double[]{0.0D,0.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{-51.29573570574929D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{9.860556780357475D,1.0D,0.0D};
    Object v4 = new double[]{48.50048191407134D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(3.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D};
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{};
    Object v2 = new double[]{0.0D,20.545639451051983D,0.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D,0.0D,-10.370029723625468D};
    Object v4 = new double[]{20.849586179452718D,-46.45863957147241D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyUTest(((double[])v3),((double[])v4));
    Object v6 = new double[]{60.76574508718038D,2.0D};
    Object v7 = new double[]{3.0D,1.0D,0.0D};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
    org.junit.Assert.assertEquals((Object)(5.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D,71.56154334058986D};
    Object v4 = new double[]{-20.786001188064187D,1.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(3.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D,-9.23357475557783D};
    Object v4 = new double[]{1.0D,-20.765098334133576D,0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyUTest(((double[])v3),((double[])v4));
    Object v6 = new double[]{28.603997047057767D};
    Object v7 = new double[]{21.048103248350067D};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
    org.junit.Assert.assertEquals((Object)(1.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{1.0D,27.13249458096906D};
    Object v4 = new double[]{0.0D,1.0186485886120274E93D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(2.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D};
    Object v4 = new double[]{62.28390190175838D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    Object v6 = new double[]{0.20391758790300996D};
    Object v7 = new double[]{};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{26.42002718478703D,0.0D,0.0D};
    Object v5 = new double[]{-25.05937864861641D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyUTest(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(0.17971249487899976D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{-14.745022659145494D,-61.81643311063402D};
    Object v5 = new double[]{10.157397895653778D,0.0D,0.42811664817599904D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyUTest(((double[])v4),((double[])v5));
    Object v7 = new double[]{};
    Object v8 = new double[]{-51.57412501812331D,17.21243481258543D,2.0D};
    Object v9 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v7),((double[])v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{40.522781078307055D};
    Object v4 = new double[]{-18.95616986305575D,0.0D,0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(3.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{1.0D};
    Object v2 = new double[]{1.0D,1.0D,2.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(2.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{23.322797912494813D,0.0D};
    Object v4 = new double[]{-7.983761992162862D,0.0D,0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    Object v6 = new double[]{-35.633664334214416D,28.807802741763275D};
    Object v7 = new double[]{};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{55.61819999654096D};
    Object v4 = new double[]{-36.42735182390328D,2.0D,-30.264857161740757D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(3.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{-16.68406890559555D,18.18052049229422D,0.0D};
    Object v4 = new double[]{20.21342826537326D,1.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(5.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{-2.2252250274982797D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = ((java.lang.Enum)v0).hashCode();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{-28.63715786110081D,1.0D};
    Object v5 = new double[]{0.0D,2.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyUTest(((double[])v4),((double[])v5));
    Object v7 = new double[]{44.47508349952029D};
    Object v8 = new double[]{0.0D,-34.2277682193445D};
    Object v9 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v7),((double[])v8));
    org.junit.Assert.assertEquals((Object)(2.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{};
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{};
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{2.0D};
    Object v5 = new double[]{4.2535191411495425D,-7.797743513740393D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyUTest(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.FIXED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{};
    Object v4 = new double[]{-13.16706529944209D,-11.53735503016132D,16.10903959557994D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.FIXED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v4 = new double[]{59.46424244916967D,34.271299052832504D};
    Object v5 = new double[]{10.0762114293742D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(2.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.FIXED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.AVERAGE;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v4 = new double[]{0.0D,1.0D};
    Object v5 = new double[]{24.639648732180767D,12.129907037447932D,1.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(5.5D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{-23.715757367029664D,36.36395201481081D,-40.527016036436294D};
    Object v4 = new double[]{-1.5343804060556776D,1.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(4.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyUTest(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{36.77154416234028D};
    Object v5 = new double[]{1.0D,1.0D,8.403885259652718D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(3.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{0.0D,4.562311296739283D,0.0D};
    Object v2 = new double[]{0.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(2.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{};
    Object v4 = new double[]{17.984353958104922D,2.0D,19.777277139509895D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{};
    Object v4 = new double[]{-7.421234111192048D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = ((java.lang.Enum)v0).getDeclaringClass();
    Object v2 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v2));
    Object v4 = new double[]{0.0D};
    Object v5 = new double[]{};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.FIXED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MAXIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MAXIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D,-0.5372509367570796D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{10.218414287586551D};
    Object v4 = new double[]{0.0D,-7.349991876940532D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyUTest(((double[])v3),((double[])v4));
    Object v6 = new double[]{};
    Object v7 = new double[]{0.0D};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{1.2283920758368403D,0.0D,-5.588524216836485D};
    Object v4 = new double[]{1.0D,-58.4864852811929D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(4.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MAXIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{1.0D,35.29533071212729D,0.0D};
    Object v4 = new double[]{22.916290569964588D,0.0D,-20.411268207403392D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(7.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MAXIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{-31.797186948541068D,2.0D,1.0D};
    Object v4 = new double[]{0.0D,1.0D,0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(6.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D,-48.879393918594936D};
    Object v4 = new double[]{0.0D,0.1780795754470089D,3.786282606263579D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyUTest(((double[])v3),((double[])v4));
    Object v6 = new double[]{};
    Object v7 = new double[]{};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.FIXED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MINIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new double[]{-1.0D,2.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(2.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MAXIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D};
    Object v4 = new double[]{41.67776062541422D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyUTest(((double[])v3),((double[])v4));
    Object v6 = new double[]{0.0D,0.0D};
    Object v7 = new double[]{-14.415586629315248D};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
    org.junit.Assert.assertEquals((Object)(3.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{0.0D,26.538820317396578D,0.0D};
    Object v4 = new double[]{1.4127912846608752D,4.0D,-20.31897729258181D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(5.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MINIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.RANDOM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{-3.229230851275473D,0.0D};
    Object v4 = new double[]{46.88932100733516D,-18.010633993901997D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(2.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{-17.455915774734695D};
    Object v4 = new double[]{0.0D,23.40366832318336D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(2.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v4 = new double[]{};
    Object v5 = new double[]{0.0D,0.0D,0.0D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MAXIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{1.0D,27.17311704597766D};
    Object v4 = new double[]{5.512188923798792D,-10.941452805137166D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(3.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MAXIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{1.0D,-30.397156907353107D};
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v4 = new double[]{1.0D,24.926418212317383D};
    Object v5 = new double[]{};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.MAXIMAL;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{1.0D,13.507284191968774D};
    Object v4 = new double[]{1.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyUTest(((double[])v3),((double[])v4));
    Object v6 = new double[]{0.0D,23.774842151506302D,45.47440594634895D};
    Object v7 = new double[]{6.023350092246979D,51.65016542994169D,26.768021703074602D};
    Object v8 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v6),((double[])v7));
    org.junit.Assert.assertEquals((Object)(6.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.MAXIMUM;
    Object v2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v3 = new double[]{1.0D};
    Object v4 = new double[]{0.0D,12.218479166337119D,0.0D};
    Object v5 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v2).mannWhitneyU(((double[])v3),((double[])v4));
    org.junit.Assert.assertEquals((Object)(2.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.apache.commons.math3.stat.ranking.NaNStrategy.REMOVED;
    Object v1 = org.apache.commons.math3.stat.ranking.TiesStrategy.SEQUENTIAL;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(((org.apache.commons.math3.stat.ranking.NaNStrategy)v0),((org.apache.commons.math3.stat.ranking.TiesStrategy)v1));
    Object v4 = new double[]{1.0D,11.314882017477823D,0.0D};
    Object v5 = new double[]{-65.40835405231662D,1.0D,3.710786468418739D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v3).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(5.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    Object v1 = new double[]{0.0D};
    Object v2 = new double[]{0.0D};
    Object v3 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyUTest(((double[])v1),((double[])v2));
    Object v4 = new double[]{15.203685121940824D};
    Object v5 = new double[]{19.046779009028388D,0.0D,28.672477551326235D};
    Object v6 = ((org.apache.commons.math3.stat.inference.MannWhitneyUTest)v0).mannWhitneyU(((double[])v4),((double[])v5));
    org.junit.Assert.assertEquals((Object)(2.0D), v6);
  }
}
