package org.apache.commons.math.stat.correlation;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).getCorrelationStandardErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new double[][]{null,null};
    Object v1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((double[][])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = ((org.apache.commons.math.linear.RealMatrix)v2).transpose();
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = 33;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-37.80852901539695D,0.0D,1.0D};
    Object v2 = new double[]{-39.245295413751045D,0.0D,-7.290613189711397D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).getCorrelationStandardErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new double[][]{};
    Object v1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((double[][])v0));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{1.0D,0.0D,1.0D};
    Object v2 = new double[]{0.03883888175026369D,50.37080950286647D,1.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(-0.9998606271087026D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).getCorrelationMatrix();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[][]{null};
    Object v2 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).computeCorrelationMatrix(((double[][])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{23.771231603114046D,-18.59978178652442D};
    Object v2 = new double[]{1.0D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = 1.7885778871631932D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).scalarAdd((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrix)v1).getData();
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[][]{};
    Object v2 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).computeCorrelationMatrix(((double[][])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{11.056927645155534D,53.34026754387778D,0.0D};
    Object v2 = new double[]{1.0D,15.131226830259454D,48.20084491122485D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).getCorrelationStandardErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v3));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{53.67751748629195D,-11.089373080093052D};
    Object v2 = new double[]{0.0D,30.321319647865757D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).getCorrelationStandardErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,12.218479166337119D,38.595322883000854D};
    Object v2 = new double[]{-66.66302757961033D,1.0D,56.71078646841874D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(0.9652007959026156D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrix)v2).subtract(((org.apache.commons.math.linear.RealMatrix)v4));
    Object v6 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new double[][]{null,null,null};
    Object v1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((double[][])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = 2;
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).getColumnMatrix((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-10.282321501120032D,0.0D,11.768558582374045D};
    Object v2 = new double[]{-1.7908786681978022D,32.25738223023792D,33.69305737358475D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(0.864447881275558D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,0.0D};
    Object v2 = new double[]{10.8685179098616D,21.50866032888248D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).getCorrelationStandardErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = 2;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,-23.925068088301778D,-1.0021504125487792D};
    Object v2 = new double[]{-54.40492581489332D,1.0D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(-0.5450132667429177D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).getColumnVector((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-19.544951318389867D,-17.5986480029545D,3.980139116132868D};
    Object v2 = new double[]{2.0D,1.0D,2.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v4));
    Object v6 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).walkInOptimizedOrder(((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v3));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new double[][]{null};
    Object v1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((double[][])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = ((org.apache.commons.math.linear.RealMatrix)v2).getFrobeniusNorm();
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-0.8350323088734473D,1.0D,58.488480065133416D};
    Object v2 = new double[]{38.770279631825744D,-43.47982557535234D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(0.00584378138010143D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,7.096534495138461D};
    Object v2 = new double[]{0.0D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v3 = ((org.apache.commons.math.linear.RealMatrix)v1).walkInOptimizedOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v2));
    Object v4 = -34;
    Object v5 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{27.051812992899723D,19.890179347829D};
    Object v2 = new double[]{-10.753006685437652D,1.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(-1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,32.79457025738652D};
    Object v2 = new double[]{0.0D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-16.625157503180766D,49.002695129130004D,24.32127642749064D};
    Object v2 = new double[]{3.7236424863617734D,49.27698022337041D,-74.6752992755881D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(0.22764856777529263D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{2.0D,0.0D};
    Object v2 = new double[]{5.259876209342938D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = ((org.apache.commons.math.linear.RealMatrix)v2).getData();
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[][]{null,null};
    Object v2 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).computeCorrelationMatrix(((double[][])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v3 = ((org.apache.commons.math.linear.RealMatrix)v1).walkInOptimizedOrder(((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v2));
    Object v4 = -15;
    Object v5 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-34.9354526839341D,0.0D,28.646524521075804D};
    Object v2 = new double[]{0.0D,-19.2513434495213D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v4));
    Object v6 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,18.401696216876704D};
    Object v2 = new double[]{44.16528434383575D,32.10574759367951D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(-1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,0.0D};
    Object v2 = new double[]{1.0D,12.381514679657634D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).getCorrelationStandardErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,0.0D};
    Object v2 = new double[]{0.0D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = -27;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).walkInColumnOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = -6;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,0.0D,1.0D};
    Object v2 = new double[]{-0.02211613952281489D,0.0D,1.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v4));
    Object v6 = -27.177692719150343D;
    Object v7 = ((org.apache.commons.math.linear.RealMatrix)v5).scalarAdd((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = ((org.apache.commons.math.linear.RealMatrix)v2).getNorm();
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{4.986926725633452D,-40.004427884322524D,1.0D};
    Object v2 = new double[]{7.627717338660345D,-19.07826712530793D,2.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(0.9926764016698186D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{1.0D,11.685266114419901D};
    Object v2 = new double[]{0.0D,64.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = 0;
    Object v4 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v4));
    ((org.apache.commons.math.linear.RealMatrix)v2).setRowMatrix((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.linear.RealMatrix)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrix)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = 3;
    Object v5 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = 17;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[][]{null,null,null};
    Object v2 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).computeCorrelationMatrix(((double[][])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = -25;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).walkInOptimizedOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = new double[]{4.762507933188503D,1.0D,-19.55948721879451D};
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).operate(((double[])v3));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,0.0D,0.0D};
    Object v2 = new double[]{0.0D,Double.NaN,1.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).getCorrelationStandardErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).getRow((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{27.230755899286745D,0.0D};
    Object v2 = new double[]{0.0D,-0.8970144212711569D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v4));
    Object v6 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = -55;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = 1;
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).getColumnMatrix((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = 0;
    Object v3 = ((org.apache.commons.math.linear.RealMatrix)v1).getColumn((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{16.848234010958166D,0.0D,1.0D};
    Object v2 = new double[]{-10.587113489118117D,1.0D,-14.739119844242502D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(-0.31379425323037596D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,1.0D,6.474771983941554D};
    Object v2 = new double[]{0.0D,-13.189560178985857D,-17.25433857392011D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(-0.7800879659766727D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{7.085552759966067D,1.0D};
    Object v2 = new double[]{0.0D,71.88774490857183D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(-0.9999999999999999D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-29.782047201840534D,-9.872229489270243D,0.0D};
    Object v2 = new double[]{-7.183545814649409D,13.666258546757538D,-47.410872113133415D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(-0.4904245791028618D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-13.952655403731647D,0.0D,1.0D};
    Object v2 = new double[]{0.0D,-11.896705561989174D,3.770732319443089D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(-0.22904587040424593D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{40.14009197543125D,0.0D};
    Object v2 = new double[]{0.0D,-4.829961439992577D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(0.9999999999999999D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = 1;
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).getColumnVector((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{2.0D,14.577523228134748D,2.0D};
    Object v2 = new double[]{40.335237361474576D,-21.564442973482294D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).getCorrelationStandardErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = 39.772049074301584D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrix)v2).scalarAdd((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,-35.455301952130036D};
    Object v2 = new double[]{40.451995507724455D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(0.9999999999999999D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v4 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrix)v2).add(((org.apache.commons.math.linear.RealMatrix)v4));
    Object v6 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.AnyMatrix)v1).isSquare();
    Object v3 = 27;
    Object v4 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-30.054441386330176D,-21.722265433151662D};
    Object v2 = new double[]{-46.502728299641696D,16.777990027935665D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = -28.019316676451165D;
    ((org.apache.commons.math.linear.RealMatrix)v2).setEntry((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{4.0D,10.929503850599257D,-42.43734370871716D};
    Object v2 = new double[]{11.213830727131617D,0.0D,56.150192972758376D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v4));
    Object v6 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v7 = ((org.apache.commons.math.linear.RealMatrix)v5).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v6));
    Object v8 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{7.689217450366339D,-28.596310037818398D};
    Object v2 = new double[]{0.0D,20.15121532865577D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v4));
    Object v6 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = ((org.apache.commons.math.linear.RealMatrix)v2).copy();
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{2.0D,-7.263992399352386D,-32.47813138067591D};
    Object v2 = new double[]{8.116497850889045D,52.683061045163704D,86.42354891213861D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(-0.942537746419687D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v2 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v1));
    Object v3 = ((org.apache.commons.math.linear.AnyMatrix)v2).isSquare();
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.AnyMatrix)v1).isSquare();
    Object v3 = 4;
    Object v4 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-13.805980032378827D,0.0D,0.0D};
    Object v2 = new double[]{0.0D,-67.28042139787345D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v4));
    Object v6 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = -1;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{1.0D,0.0D};
    Object v2 = new double[]{0.0D,-49.406817174385914D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{0.0D,0.0D};
    Object v2 = new double[]{0.0D,0.0D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v4));
    Object v6 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = 15;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v3 = ((org.apache.commons.math.linear.RealMatrix)v1).walkInOptimizedOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v2));
    Object v4 = 9;
    Object v5 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{1.0D,0.0D};
    Object v2 = new double[]{1.0D,-6.5863799915651295D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{-25.427811356789125D,51.84322982837297D,14.687678652544266D};
    Object v2 = new double[]{1.0D,-15.2688979778075D,53.73846021285961D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    Object v4 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).getCorrelationStandardErrors();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
    Object v1 = new double[]{6.0D,0.0D};
    Object v2 = new double[]{1.0D,-13.374987805487171D};
    Object v3 = ((org.apache.commons.math.stat.correlation.PearsonsCorrelation)v0).correlation(((double[])v1),((double[])v2));
    org.junit.Assert.assertEquals((Object)(0.9999999999999999D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = 25;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new double[]{-36.401607254737215D,-0.6343906225865299D,1.0D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(((double[])v0));
    Object v2 = 11;
    Object v3 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }
}
