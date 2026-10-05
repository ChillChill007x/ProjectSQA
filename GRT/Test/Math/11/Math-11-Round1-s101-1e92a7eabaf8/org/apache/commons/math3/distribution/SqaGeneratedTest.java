package org.apache.commons.math3.distribution;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new double[]{13.10028217218288D,4.037973005709474D};
    Object v1 = new double[][]{};
    Object v2 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((double[])v0),((double[][])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,0.0D,31.78268722840289D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextInt();
    Object v2 = new double[]{0.0D};
    Object v3 = new double[][]{};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-11.033572168360944D,2.0D,19.321092181501957D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-5.454412219829374D,0.0D,0.0D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-9.788347527549499D,1.0D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-47.670147786744636D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new byte[]{Byte.valueOf((byte)55),Byte.valueOf((byte)-90),Byte.valueOf((byte)-82)};
    ((org.apache.commons.math3.random.RandomGenerator)v0).nextBytes(((byte[])v1));
    Object v2 = null;
    Object v3 = new double[]{};
    Object v4 = new double[][]{};
    Object v5 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v3),((double[][])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{58.96617296875334D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((org.apache.commons.math3.distribution.MultivariateNormalDistribution)v0).sample();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = 2;
    Object v2 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextInt((((java.lang.Integer)v1).intValue()));
    Object v3 = new double[]{0.0D};
    Object v4 = new double[][]{};
    Object v5 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v3),((double[][])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new double[]{2.0D,-13.598387508437705D};
    Object v1 = new double[][]{null};
    Object v2 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((double[])v0),((double[][])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextLong();
    Object v2 = new double[]{0.0D,19.127971332266704D};
    Object v3 = new double[][]{null,null,null};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-27.405407872676356D,1.0D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextFloat();
    Object v2 = new double[]{0.0D,0.0D};
    Object v3 = new double[][]{null,null};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{1.0D,2.847653455671381E184D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-14.89665041015762D,31.1574631144939D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-21.84293254809111D,-24.252795292478684D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-34.72273874915635D,9.652513855013343D,43.509861705116876D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-68.43901359661388D,2.0D,5.6346609235607445D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{47.39397630157721D,0.0D,0.0D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextInt();
    Object v2 = new double[]{-11.28391269483007D};
    Object v3 = new double[][]{};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{1.0D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{13.977676797106529D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -34;
    Object v2 = ((org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution)v0).sample((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new double[]{-72.46672429790618D,0.0D,22.926418212317383D};
    Object v1 = new double[][]{};
    Object v2 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((double[])v0),((double[][])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{1.0D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = new double[][]{null,null};
    Object v2 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((double[])v0),((double[][])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new byte[]{Byte.valueOf((byte)-60)};
    ((org.apache.commons.math3.random.RandomGenerator)v0).nextBytes(((byte[])v1));
    Object v2 = null;
    Object v3 = new double[]{};
    Object v4 = new double[][]{};
    Object v5 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v3),((double[][])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{2.0D,0.0D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextFloat();
    Object v2 = new double[]{1.0D,-35.86662038766708D};
    Object v3 = new double[][]{null,null};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new byte[]{Byte.valueOf((byte)60),Byte.valueOf((byte)-1),Byte.valueOf((byte)-71)};
    ((org.apache.commons.math3.random.RandomGenerator)v0).nextBytes(((byte[])v1));
    Object v2 = null;
    Object v3 = new double[]{-28.631138394316185D,1.0D};
    Object v4 = new double[][]{};
    Object v5 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v3),((double[][])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{24.0D,1.0D,-9.170353479478981D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{1.0D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,-21.147560341861006D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -13;
    Object v2 = ((org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution)v0).sample((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,0.0D,0.0D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextBoolean();
    Object v2 = new double[]{2.0D};
    Object v3 = new double[][]{null,null,null};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((org.apache.commons.math3.distribution.MultivariateNormalDistribution)v0).getStandardDeviations();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextInt();
    Object v2 = new double[]{2.0D,0.0D,0.0D};
    Object v3 = new double[][]{null};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,-10.915409318914762D,1.1700878656444236D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 28;
    Object v2 = ((org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution)v0).sample((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{22.372023342438965D,0.0D,-5.3144110788806636D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = ((org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution)v0).sample((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,1.0D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-34.92368375901135D,7.827121743134072D,1.0D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 9;
    Object v2 = ((org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution)v0).sample((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-41.08436576911455D,1.0D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = -27L;
    ((org.apache.commons.math3.random.RandomGenerator)v0).setSeed((((java.lang.Long)v1).longValue()));
    Object v2 = null;
    Object v3 = new double[]{1.0D};
    Object v4 = new double[][]{null};
    Object v5 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v3),((double[][])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-3.927288205606102D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-2.527064080437329D,21.013661066504252D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{1.0D,9.133274562492973D,4.0D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{1.0D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new double[]{-61.71878612586645D,0.0D};
    Object v2 = ((org.apache.commons.math3.distribution.MultivariateNormalDistribution)v0).density(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextGaussian();
    Object v2 = new double[]{0.0D,-10.961484741686784D};
    Object v3 = new double[][]{null,null,null};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-11.212798339287579D,-44.34588156295765D,-33.97381160395191D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = ((org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution)v0).sample((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{9.0D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,-14.303185863576767D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextInt();
    Object v2 = new double[]{2.0D,1.0D};
    Object v3 = new double[][]{null,null};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextDouble();
    Object v2 = new double[]{0.0D,1.0D,28.448829697311936D};
    Object v3 = new double[][]{null,null};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-7.572910420127024D,0.0D,1.0D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,2.0D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{28.211734425942655D,-33.09336130829118D,-12.868281562577126D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,44.99938157937753D,20.481680259844254D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new double[]{0.0D,0.0D};
    Object v1 = new double[][]{null,null};
    Object v2 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((double[])v0),((double[][])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{2.5364748510179016D,0.0D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new byte[]{Byte.valueOf((byte)-9)};
    ((org.apache.commons.math3.random.RandomGenerator)v0).nextBytes(((byte[])v1));
    Object v2 = null;
    Object v3 = new double[]{0.0D};
    Object v4 = new double[][]{null};
    Object v5 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v3),((double[][])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{26.331885140082793D,35.68494313159828D,0.0D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{6.956667576232955D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{21.170247685289375D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,1.0D,-0.2586218864148412D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{2.431286224466835D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = 1;
    Object v2 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextInt((((java.lang.Integer)v1).intValue()));
    Object v3 = new double[]{-67.48388832572076D};
    Object v4 = new double[][]{};
    Object v5 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v3),((double[][])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new double[]{13.292162435179797D,3.0D};
    Object v1 = new double[][]{null,null,null};
    Object v2 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((double[])v0),((double[][])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-66.02669622324323D,1.0D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{12.920932923137956D,20.78672011190817D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,-66.99877086843576D,-1.7857725892474168D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,0.0D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new double[]{0.14540930293080034D};
    Object v1 = new double[][]{null};
    Object v2 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((double[])v0),((double[][])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution)v0).getDimension();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{1.0D,51.3212362732011D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new double[]{-1.8115736261239488D};
    Object v2 = ((org.apache.commons.math3.distribution.MultivariateNormalDistribution)v0).density(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = ((org.apache.commons.math3.random.RandomGenerator)v0).nextBoolean();
    Object v2 = new double[]{0.0D,0.0D,0.0D};
    Object v3 = new double[][]{null};
    Object v4 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v2),((double[][])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,0.0D,-79.90349368610086D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{1.0D,0.0D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{25.239705052219144D,0.0D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = new double[][]{};
    Object v2 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((double[])v0),((double[][])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,-3.6031207089492825D};
    Object v2 = new double[][]{null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{-14.849622097357562D,0.0D};
    Object v2 = new double[][]{};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,37.414267428941685D};
    Object v2 = new double[][]{null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.random.MersenneTwister();
    Object v1 = new double[]{0.0D,0.0D,17.86092491454665D};
    Object v2 = new double[][]{null,null,null};
    Object v3 = new org.apache.commons.math3.distribution.MultivariateNormalDistribution(((org.apache.commons.math3.random.RandomGenerator)v0),((double[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
