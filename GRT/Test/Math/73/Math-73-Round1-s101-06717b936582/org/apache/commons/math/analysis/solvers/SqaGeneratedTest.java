package org.apache.commons.math.analysis.solvers;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = 12.497651018803564D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).setAbsoluteAccuracy((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).resetRelativeAccuracy();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v2).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = 1.7336351272753454D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).setRelativeAccuracy((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = -27.239319811966947D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v2).solve((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.7847265816164287D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 2.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 50;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -14.132865935114854D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.9066434671581798D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 24.343264599052247D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 0;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 50;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -30.372815937179663D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.9608056260640496D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = -30.748102585568525D;
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 50;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 0.0D;
    Object v4 = 73.955982950573D;
    Object v5 = 8.067793004795991D;
    Object v6 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.5044581436131571D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 50;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 1.0D;
    Object v4 = 45.5643212642094D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0000875341283058D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).resetFunctionValueAccuracy();
    Object v1 = null;
    Object v2 = 1.0D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 2.608570840308735D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 55.74662791846254D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-6D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 0.0D;
    Object v2 = 73.71356153507249D;
    Object v3 = 5.940952440572276D;
    Object v4 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = -10;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = -32.36483048015489D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 50;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -8.569997520178516D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.39341428652882543D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).resetFunctionValueAccuracy();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 31;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 26.347231411190823D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-6D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 50;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -22.37159897597234D;
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = 39.36106364429131D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.15489059626101173D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 1;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 50;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -2.475402353339831D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.5044582265246467D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 50;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 0.0D;
    Object v4 = 27.430302252450964D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 4.8904582931318314D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 0.0D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = -11;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = -8.577671872489566D;
    Object v8 = 1.0D;
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).getFunctionValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 50;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -17.194322721657784D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.27628822332106356D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = -16.739245372844003D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 1.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setAbsoluteAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = 50;
    Object v8 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v7).intValue()));
    Object v9 = -9.088825130921613D;
    Object v10 = 0.0D;
    Object v11 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = -41.299832991896835D;
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 0.0D;
    Object v8 = 20.92913659594225D;
    Object v9 = 4.097042087826786D;
    Object v10 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.3934143111535781D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).resetFunctionValueAccuracy();
    Object v1 = null;
    Object v2 = 50;
    Object v3 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v2).intValue()));
    Object v4 = -47.29333634736472D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.5044581419303423D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).resetFunctionValueAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 1.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = 23;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setMaximalIterationCount((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetMaximalIterationCount();
    Object v5 = null;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).resetFunctionValueAccuracy();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 27.353996834762206D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = -2.4853642860684992D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).setFunctionValueAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-6D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    Object v2 = 31.375286432595775D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 1.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = -45;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 0.0D;
    Object v8 = 10.580607375605148D;
    Object v9 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = -19.92035237030703D;
    Object v11 = 0.0D;
    Object v12 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.031098338318489D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 41.703269199990906D;
    Object v8 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v6).value((((java.lang.Double)v7).doubleValue()));
    Object v9 = -25.509970191247273D;
    Object v10 = 0.0D;
    Object v11 = -10.322206118874929D;
    Object v12 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.39341431174688624D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetAbsoluteAccuracy();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetAbsoluteAccuracy();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-6D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 0.0D;
    Object v8 = 1.878083609722828D;
    Object v9 = 1.0D;
    Object v10 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.00008243015401D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 1.0D;
    Object v8 = 10.422704571213238D;
    Object v9 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0027752065614188D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = -16;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 1.0D;
    Object v8 = 25.515713153341437D;
    Object v9 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0000875341283058D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetMaximalIterationCount();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = -5.355249041754489D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).resetFunctionValueAccuracy();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetRelativeAccuracy();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-6D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setAbsoluteAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 17.396520430475682D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = 1;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setMaximalIterationCount((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).resetFunctionValueAccuracy();
    Object v5 = null;
    Object v6 = 50;
    Object v7 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v6).intValue()));
    Object v8 = 2.0D;
    Object v9 = Double.NaN;
    Object v10 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 0.0D;
    Object v8 = 79.9080908733555D;
    Object v9 = 1.0D;
    Object v10 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0000875341283058D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = -7.232079342660158D;
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.9040114803325197D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 1.0D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).setFunctionValueAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 1;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setMaximalIterationCount((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = -15.199447691759255D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setAbsoluteAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = -15.851813294949013D;
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.03109834837498127D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -5.19459171267447D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetRelativeAccuracy();
    Object v5 = null;
    Object v6 = 50;
    Object v7 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v6).intValue()));
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v7).value((((java.lang.Double)v8).doubleValue()));
    Object v10 = -7.9627759878359345D;
    Object v11 = 0.0D;
    Object v12 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v7),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.995488149419874D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = -47;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setMaximalIterationCount((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetRelativeAccuracy();
    Object v5 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetRelativeAccuracy();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetRelativeAccuracy();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).resetFunctionValueAccuracy();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetMaximalIterationCount();
    Object v5 = null;
    Object v6 = 0.0D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).setFunctionValueAccuracy((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setAbsoluteAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 1.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = -26.57592487027726D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetMaximalIterationCount();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).resetFunctionValueAccuracy();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    Object v1 = 50;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 0.0D;
    Object v4 = 2.277055952408778D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0058204354461462D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 0.0D;
    Object v6 = 10.701062781042708D;
    Object v7 = 10.682897704004944D;
    Object v8 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0055677652163868D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 0.0D;
    Object v8 = 14.596408217846463D;
    Object v9 = 0.8671106384840752D;
    Object v10 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.7015831491161383D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = -3.581233338531594D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = 0.0D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).setFunctionValueAccuracy((((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 50;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 36.77154416234028D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 50;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = -19.414921732658076D;
    Object v8 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v6).value((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0.0D;
    Object v10 = 43.05551869921731D;
    Object v11 = ((org.apache.commons.math.analysis.solvers.BrentSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0032730153910028D), v11);
  }
}
