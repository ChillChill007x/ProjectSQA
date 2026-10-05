package org.apache.commons.math.stat.regression;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 12.264513308387349D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = Double.NaN;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getInterceptStdErr();
    Object v2 = -30.149332491441704D;
    Object v3 = 1.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSumSquaredErrors();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getMeanSquareError();
    Object v2 = -42.925383356201635D;
    Object v3 = 13.642399484719714D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = new double[][]{null};
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData(((double[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getRSquare();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getTotalSumSquares();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getTotalSumSquares();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getMeanSquareError();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSumSquaredErrors();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlope();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 1.0D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).predict((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlope();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 0.0D;
    Object v2 = 16.009065370584043D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getMeanSquareError();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 10.416746150418781D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 1.0D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 0.0D;
    Object v2 = -31.69171046712933D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).clear();
    Object v1 = null;
    Object v2 = new double[][]{null,null,null};
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData(((double[][])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getRegressionSumSquares();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -3.7561311138592224D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getRSquare();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getRegressionSumSquares();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getMeanSquareError();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = new double[][]{null,null,null};
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData(((double[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 56.04071251543197D;
    Object v2 = 19.44521940758946D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = new double[][]{};
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData(((double[][])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 1.0D;
    Object v2 = 23.77910034981141D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getN();
    org.junit.Assert.assertEquals((Object)(1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 25.405815697770475D;
    Object v2 = 1.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).clear();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 1.0D;
    Object v2 = -5.7530664462806875D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 25.488215347518196D;
    Object v2 = -16.729704745791736D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getRSquare();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 10.926591083914564D;
    Object v2 = -30.748102585568525D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 73.955982950573D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 2.147483647E9D;
    Object v2 = 0.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getRSquare();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlope();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getTotalSumSquares();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 1.8616773924345944D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).clear();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -8.48643928705609D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getIntercept();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlope();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSignificance();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 12.211573393934433D;
    Object v2 = -43.3802942905119D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    Object v2 = new double[][]{null};
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData(((double[][])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 0.0D;
    Object v2 = -5.7175346344264195D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -12.963228247835142D;
    Object v2 = -35.23636452216762D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 0.0D;
    Object v2 = 37.23780296693809D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlope();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = new double[][]{null,null};
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData(((double[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = new double[][]{};
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData(((double[][])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -9.383788034074895D;
    Object v2 = 19.0232963088862D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -46.670147786744636D;
    Object v2 = 0.7445507649608837D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).clear();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getTotalSumSquares();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 30.06486881327818D;
    Object v2 = 12.496011229288884D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getMeanSquareError();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 6.7128909406684D;
    Object v2 = 0.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getInterceptStdErr();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getRSquare();
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getMeanSquareError();
    Object v2 = 2.4863948937473617D;
    Object v3 = 0.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 17.12257816734043D;
    Object v2 = 0.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -30.726370844484077D;
    Object v2 = 0.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -19.92318615651906D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSumSquaredErrors();
    Object v2 = 0.0D;
    Object v3 = -23.333610792255108D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -63.774901335422946D;
    Object v2 = -6.364914182829712D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = Double.NaN;
    Object v2 = 4.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -48.17449184240025D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -33.37279084666236D;
    Object v2 = 35.15290327389392D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = 20.267008765367613D;
    Object v5 = 1.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getMeanSquareError();
    Object v2 = new double[][]{null,null,null};
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData(((double[][])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSumSquaredErrors();
    Object v2 = -25.893793439917875D;
    Object v3 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getIntercept();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getMeanSquareError();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getMeanSquareError();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 12.941032272319092D;
    Object v2 = 0.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSumSquaredErrors();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 32.42352846217957D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getInterceptStdErr();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getTotalSumSquares();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlope();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getInterceptStdErr();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlope();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 2.0D;
    Object v2 = 0.0D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getRSquare();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getTotalSumSquares();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = -19.981341512083063D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getRegressionSumSquares();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 0.0D;
    Object v2 = -11.657562864465289D;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 13.41580101269027D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getRSquare();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 0.6095817921471128D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeConfidenceInterval((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlope();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).clear();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlope();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getN();
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 4.275206117576477D;
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).predict((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getInterceptStdErr();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getSlopeStdErr();
    Object v2 = new double[][]{null,null,null};
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData(((double[][])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = 21.20721973658181D;
    Object v2 = Double.POSITIVE_INFINITY;
    ((org.apache.commons.math.stat.regression.SimpleRegression)v0).addData((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.regression.SimpleRegression();
    Object v1 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    Object v2 = ((org.apache.commons.math.stat.regression.SimpleRegression)v0).getR();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }
}
