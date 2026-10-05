package org.apache.commons.math.stat.descriptive.moment;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{-10.145549761066928D,0.0D,0.0D};
    Object v2 = new double[]{};
    Object v3 = 47.94785017358135D;
    Object v4 = 1;
    Object v5 = 30;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),((double[])v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v2 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{};
    Object v2 = 1.0D;
    Object v3 = 1;
    Object v4 = 2;
    Object v5 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = 0.0D;
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).increment((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{};
    ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v0).setData(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{14.10028217218288D,3.037973005709474D};
    Object v2 = 0;
    Object v3 = 40;
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).incrementAll(((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{0.0D};
    Object v2 = 0;
    Object v3 = 11;
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{49.198474460085386D,-21.56007482731805D};
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1));
    Object v3 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).getResult();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(2131231681), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v0).getData();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{};
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{7.743118009648195D};
    ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v0).setData(((double[])v1));
    Object v2 = null;
    Object v3 = new double[]{};
    ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v0).setData(((double[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{7.357517644639742D};
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{};
    Object v2 = new double[]{43.37627502777264D,23.362569762411084D,0.0D};
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),((double[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{};
    Object v2 = new double[]{1.0D};
    Object v3 = 8.186504528282814D;
    Object v4 = 0;
    Object v5 = 26;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),((double[])v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{6.192227342396837D,-6.981062314754047D};
    Object v2 = new double[]{};
    Object v3 = -15;
    Object v4 = 7;
    Object v5 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),((double[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{};
    Object v2 = new double[]{-2.5684227601781853D,0.0D};
    Object v3 = 1.0D;
    Object v4 = -19;
    Object v5 = -5;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),((double[])v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).copy();
    Object v2 = new double[]{12.415360966528525D,19.44521940758946D,1.0D};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).incrementAll(((double[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{};
    Object v2 = new double[]{0.0D,0.0D,0.0D};
    Object v3 = 23.77910034981141D;
    Object v4 = -19;
    Object v5 = -23;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),((double[])v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = 6.444863764855706D;
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).increment((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{};
    Object v2 = 16;
    Object v3 = -52;
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{-13.798277628350068D,13.930083536706247D,1.0D};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).incrementAll(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{6.591125939408797D,-54.89280441524242D,0.0D};
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1139.4894349291344D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v2 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).hashCode();
    Object v3 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v2 = new double[]{6.591125939408797D,-54.89280441524242D,0.0D};
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).equals(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).getResult();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)v0).getN();
    Object v2 = new double[]{11.926591083914564D};
    Object v3 = 6;
    Object v4 = -49;
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).incrementAll(((double[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{0.0D};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).incrementAll(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = new double[]{0.0D,-0.8711978707080034D};
    Object v2 = 0.0D;
    Object v3 = 4;
    Object v4 = 42;
    Object v5 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).evaluate(((double[])v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).hashCode();
    Object v2 = -8.159944265373944D;
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).increment((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v1).getData();
    Object v3 = 0.0D;
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).increment((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).getN();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v3 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).copy();
    Object v4 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{2.0D};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v5 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v4).copy();
    org.apache.commons.math.stat.descriptive.moment.Variance.copy(((org.apache.commons.math.stat.descriptive.moment.Variance)v1),((org.apache.commons.math.stat.descriptive.moment.Variance)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = 1.0D;
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).increment((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v3 = new double[]{49.198474460085386D,-21.56007482731805D};
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).evaluate(((double[])v3));
    Object v5 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).getResult();
    Object v6 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).equals(((java.lang.Object)v5));
    Object v7 = new double[]{81.6857359358446D,67.51206863993957D,-21.48845349232038D};
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v3 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).copy();
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v3).getN();
    Object v5 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v1).getData();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{0.0D,1.0D,0.0D};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2));
    Object v3 = null;
    Object v4 = 0.0D;
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).increment((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = -28.662048723627546D;
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).increment((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{};
    Object v3 = new double[]{-8.561006446784083D,2.0D,-17.490316077568206D};
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{0.0D};
    Object v3 = -33;
    Object v4 = -11;
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{-6.727756438216798D};
    Object v3 = new double[]{};
    Object v4 = -22.9424343402441D;
    Object v5 = -42;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{0.0D,1.0D};
    Object v3 = new double[]{22.104290054649905D,33.54936789323728D,0.0D};
    Object v4 = 3;
    Object v5 = 6;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v3 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).copy();
    org.apache.commons.math.stat.descriptive.moment.Variance.copy(((org.apache.commons.math.stat.descriptive.moment.Variance)v1),((org.apache.commons.math.stat.descriptive.moment.Variance)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = 0.0D;
    Object v5 = -6;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{0.0D};
    Object v3 = 0;
    Object v4 = 0;
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).getResult();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{-52.28942235930494D,19.834699803501415D};
    Object v3 = new double[]{};
    Object v4 = 1.0D;
    Object v5 = 0;
    Object v6 = -9;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{0.0D,1.0D,8.736108445073281D};
    Object v3 = 2;
    Object v4 = 0;
    ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v1).setData(((double[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new double[]{-21.28184385702157D,-14.311404385962023D,1.807079006910921D};
    Object v7 = new double[]{2.0D};
    Object v8 = -4.556913105000419D;
    Object v9 = 0;
    Object v10 = 48;
    Object v11 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).isBiasCorrected();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{13.423612931552373D,-14.179361093998853D,1.0D};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v2).incrementAll(((double[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{16.82494738017984D};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2));
    Object v3 = null;
    Object v4 = new double[]{72.73326488802816D,-3.3117034630072597D};
    Object v5 = 54;
    Object v6 = 8;
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{5.821030809785553D,-25.86566807704241D};
    Object v4 = -17.93538106642285D;
    Object v5 = 41;
    Object v6 = -9;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).evaluate(((double[])v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = 1;
    Object v5 = 1;
    ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v2).setData(((double[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v1).getData();
    Object v3 = new double[]{};
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D};
    Object v4 = -1.0D;
    Object v5 = 6;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{1.0D,9.881488184269603D,0.0D};
    Object v4 = new double[]{-5.117739764724319D};
    Object v5 = 24.56485553015999D;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).evaluate(((double[])v3),((double[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{5.74159507329166D,1.0D};
    Object v4 = 16.718679244466102D;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).evaluate(((double[])v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v2).getData();
    Object v4 = ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v2).getData();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{};
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).evaluate(((double[])v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{1.0D};
    Object v3 = new double[]{-8.120249224523873D,0.0D,0.0D};
    Object v4 = -2;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new double[]{0.0D,65.63591725304238D};
    Object v3 = new double[]{};
    Object v4 = 0.0D;
    Object v5 = 14;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{-15.230224672544232D};
    Object v4 = new double[]{0.0D};
    Object v5 = 8;
    Object v6 = -36;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v3),((double[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v4 = new double[]{6.591125939408797D,-54.89280441524242D,0.0D};
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v3).evaluate(((double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v2).equals(((java.lang.Object)v6));
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).clear();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{0.0D,-13.561620504996844D};
    Object v4 = -13;
    Object v5 = 1;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).evaluate(((double[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{-2.590651948223346D,12.09279553369194D};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2));
    Object v3 = null;
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).clear();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(2131231681), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{1.0D,0.0D,-2.551571863686856D};
    Object v3 = -12.554629041288731D;
    Object v4 = 49;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{0.0D,-33.16231150552924D};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.ThirdMoment(((org.apache.commons.math.stat.descriptive.moment.ThirdMoment)v1));
    Object v3 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()),((org.apache.commons.math.stat.descriptive.moment.SecondMoment)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new double[]{-39.21724500374312D,-17.108283361797376D};
    Object v3 = new double[]{0.0D};
    Object v4 = 1.0D;
    Object v5 = 1;
    Object v6 = 32;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v2).getData();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).clear();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{0.0D};
    Object v4 = 0.0D;
    Object v5 = 0;
    Object v6 = 49;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).evaluate(((double[])v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.ThirdMoment(((org.apache.commons.math.stat.descriptive.moment.ThirdMoment)v1));
    Object v3 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()),((org.apache.commons.math.stat.descriptive.moment.SecondMoment)v2));
    Object v4 = ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v3).getData();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{0.0D};
    Object v3 = 1;
    Object v4 = 0;
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{1.0D,0.0D};
    Object v3 = 1;
    Object v4 = 25;
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v3 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).copy();
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v3).getResult();
    Object v5 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).evaluate(((double[])v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{};
    ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v2).setData(((double[])v3));
    Object v4 = null;
    Object v5 = new double[]{-20.238491948505743D,17.325352205766393D};
    ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v2).setData(((double[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = 16;
    Object v5 = -22;
    Object v6 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance(((org.apache.commons.math.stat.descriptive.moment.SecondMoment)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).setBiasCorrected((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.ThirdMoment(((org.apache.commons.math.stat.descriptive.moment.ThirdMoment)v0));
    Object v2 = new double[]{1.0D,0.0D};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
    Object v1 = false;
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new double[]{0.0D,-3.7567146512096703D,Double.NaN};
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance(((org.apache.commons.math.stat.descriptive.moment.SecondMoment)v0));
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).getN();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance(((org.apache.commons.math.stat.descriptive.moment.SecondMoment)v0));
    Object v2 = 1.0D;
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).increment((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = new double[]{1.0D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).evaluate(((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).copy();
    Object v3 = ((org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic)v2).evaluate();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new double[]{};
    Object v3 = 1;
    Object v4 = -47;
    ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).incrementAll(((double[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()),((org.apache.commons.math.stat.descriptive.moment.SecondMoment)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.Variance(((org.apache.commons.math.stat.descriptive.moment.SecondMoment)v0));
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v3 = new double[]{7.357517644639742D};
    Object v4 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v2).evaluate(((double[])v3));
    Object v5 = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic)v1).equals(((java.lang.Object)v4));
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).clear();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.descriptive.moment.Variance();
    Object v1 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v0).copy();
    Object v2 = new double[]{1.0D,5.549127548317325D};
    Object v3 = new double[]{};
    Object v4 = -25.17251331851814D;
    Object v5 = 6;
    Object v6 = 15;
    Object v7 = ((org.apache.commons.math.stat.descriptive.moment.Variance)v1).evaluate(((double[])v2),((double[])v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.math.stat.descriptive.moment.FourthMoment();
    Object v2 = new org.apache.commons.math.stat.descriptive.moment.ThirdMoment(((org.apache.commons.math.stat.descriptive.moment.ThirdMoment)v1));
    Object v3 = new org.apache.commons.math.stat.descriptive.moment.Variance((((java.lang.Boolean)v0).booleanValue()),((org.apache.commons.math.stat.descriptive.moment.SecondMoment)v2));
    ((org.apache.commons.math.stat.descriptive.moment.Variance)v3).clear();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }
}
